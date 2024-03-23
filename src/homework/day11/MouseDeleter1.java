package homework.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MouseDeleter1 {
    public static void main(String[] args) {
        List<Mouse> syncMouseList = Collections.synchronizedList(IntStream
                .range(1, 281)
                .boxed()
                .map(Mouse::new)
                .collect(Collectors.toList()));

        IntStream.range(1, 5).forEach(i -> {
            new Thread(() -> {
                while (!syncMouseList.isEmpty()) {
                    syncMouseList.remove(0).peep();
                }
            }).start();
        });
    }
}
