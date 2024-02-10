package basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects methodsObjectsClassObject = new TrainMethodsObjects();
        methodsObjectsClassObject.processMouse(new Mouse("Buga", 3));
        methodsObjectsClassObject.processSouce(new Souce("Bechamel", "white"));
        methodsObjectsClassObject.processBee(new Bee("male", 22222L));
        methodsObjectsClassObject.processObstacle(new Obstacle("Остов автомобиля под обавлом", "major"));
        methodsObjectsClassObject.processPineapple(new Pineapple("Высший сорт", 12345));
    }
}
