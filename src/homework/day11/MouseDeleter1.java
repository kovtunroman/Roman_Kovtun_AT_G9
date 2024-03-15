package homework.day11;

import java.util.ArrayList;
import java.util.List;

public class MouseDeleter1 {
    public static void main(String[] args) {
        List<Mouse> mouseList = new ArrayList<>(20);
        for (int i = 1; i < 281; i++) {
            mouseList.add(new Mouse(i));
        }
        Object lock = new Object();
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            int finalI = i;
            Thread thread = new Thread(() -> {
                while (!mouseList.isEmpty()) {
                    synchronized (lock) {
                        if (!mouseList.isEmpty()) {
                            System.out.printf("t%s  removes ", finalI);
                            Mouse mouse = mouseList.remove(0);
                            mouse.peep();
                        }
                    }
                }
            });
            thread.start();
            threadList.add(thread);
        }
        for (Thread thread : threadList) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
