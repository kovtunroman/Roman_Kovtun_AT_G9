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
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                synchronized (lock) {
                    while (!mouseList.isEmpty()) {
                        mouseList.getFirst().peep();
                        mouseList.removeFirst();
                    }
                }
            }).start();
        }
    }
}
