package cycletask;

public class ForTraining {
    public void showOddNumbers() {
        for (int i = 3; i < 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }
}
