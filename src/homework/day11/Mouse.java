package homework.day11;

import java.util.concurrent.TimeUnit;

public class Mouse {
    private String pattern = "Mouse <n>";
    private String name;

    public Mouse(int number) {
        name = pattern.replace("<n>", String.valueOf(number));
    }

    public void peep() {
        System.out.println(name + " PEEP!");
        try {
            TimeUnit.MILLISECONDS.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
