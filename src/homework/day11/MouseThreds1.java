package homework.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MouseThreds1 {
    public static void main(String[] args) {
        List<Mouse> mouseList = new ArrayList<>(20);
        for (int i = 1; i < 21; i++) {
            mouseList.add(new Mouse(i));
        }
        for (int i = 0; i < 5; i++) {
            List<Mouse> mouseThreadList = new ArrayList<>(mouseList);
            new Thread(() -> {
                for (Mouse mouse : mouseThreadList) {
                    mouse.peep();
                }
            }).start();
        }
    }
}
