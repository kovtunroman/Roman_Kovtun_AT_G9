package basetask;

public class TrainMethodsObjects {
    public void processMouse(Mouse mouse){
        System.out.println(mouse.getName());
        System.out.println(mouse.getAge());
        mouse.printMouseDetails();
    }
    public void processSouce(Souce souce){
        System.out.println(souce.getName());
        System.out.println(souce.getColor());
        souce.printSouceDetails();
    }
    public void processBee(Bee bee){
        System.out.println(bee.getGender());
        System.out.println(bee.getWeight());
        bee.printBeeDetails();
    }
    public void processObstacle(Obstacle obstacle){
        System.out.println(obstacle.getSeverity());
        System.out.println(obstacle.getDescription());
        obstacle.printObstacleDetails();
    }
    public void processPineapple(Pineapple pineapple){
        System.out.println(pineapple.getGrade());
        System.out.println(pineapple.getHeatCapacity());
        pineapple.printPineappleDetails();
    }
}
