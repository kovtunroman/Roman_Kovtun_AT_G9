package pretask;

public class ConditionalLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++){
            if(i%2 != 0){
                continue;
            }
            System.out.println("Even number below 10 is " + i);
        }
    }
}
