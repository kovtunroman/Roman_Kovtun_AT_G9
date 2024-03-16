package homework.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MouseDeleter2 {
    public static void main(String[] args) {
        List<Mouse> syncMouseList = Collections.synchronizedList(IntStream
                .range(1, 381)
                .boxed()
                .map(Mouse::new)
                .collect(Collectors.toList()));
        Object lock = new Object();
        IntStream.range(1, 7).forEach(i -> {
            synchronized (lock) {
                new Thread(() -> {
                    while (!syncMouseList.isEmpty()) {
                        System.out.printf("Thread %s ", Thread.currentThread().threadId());
                        syncMouseList.remove(0).peep();
                        try {
                            TimeUnit.MILLISECONDS.sleep(250);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }).start();
            }
        });
    }
}
