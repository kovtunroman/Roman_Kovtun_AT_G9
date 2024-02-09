package pretask;

public class SumExample {
    private int sum(int thisInt, int withThisInt){
        return thisInt+withThisInt;
    }
    public static void main(String[] args) {
        System.out.println(new SumExample().sum(5,7));
    }
}
