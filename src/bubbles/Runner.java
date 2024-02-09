package bubbles;

public class Runner {
    public static void main(String[] args) {
        Bottle[] bottles = new Bottle[] {
                           new Bottle(0.05),
                           new Bottle(0.1),
                           new Bottle(0.2)};
        for(Bottle i : bottles){
            i.open();
            i.getWater().getNumberOfBubbles();
        }
    }
}
