package homework.day11;

import java.util.ArrayList;
import java.util.List;

public class MouseTherds2 {
    public static void main(String[] args) {
        List<Mouse> mouseList = new ArrayList<>(20);
        for (int i = 1; i < 19; i++) {
            mouseList.add(new Mouse(i));
        }
        for (int i = 0; i < 5; i++) {
            List<Mouse> mouseThreadList = new ArrayList<>(mouseList);
            new Thread(() -> {
                for (int j = 0; j < mouseThreadList.size(); j++) {
                    if (j % 2 != 0) {
                        mouseThreadList.get(j).peep();
                    }
                }
            }).start();
        }
    }
}
