package classwork.day11;

import java.util.concurrent.TimeUnit;

public class ThredSynchronizonTraining {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 3; i++) {
                    try {
                        Thread.currentThread().sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.printf("t1-%s  ", i);
                }
            }
        }).start();
        TimeUnit.MILLISECONDS.sleep(20);
        synchronized (lock) {
            for (int i = 0; i < 3; i++) {
                Thread.currentThread().sleep(1000);
                System.out.printf("m-%s  ", i);
            }
        }
    }
}
