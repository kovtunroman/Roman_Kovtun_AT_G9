package cycletask;

import java.util.Random;

public class ArrayFilingTraining {
    public int[] fillInArray(){
        int n = 7;
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(n);
        }
        return array;
    }
}
