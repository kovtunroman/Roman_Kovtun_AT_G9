package basetask;

public class TrainMethodsStringRunner {
    public static void main(String[] args) {
        TrainMethodsString methodsStringClassObject = new TrainMethodsString();
        String inputString = "и все тоже мыли";
        methodsStringClassObject.printMama();
        methodsStringClassObject.printPapa();
        methodsStringClassObject.printString(inputString);
        methodsStringClassObject.printMamaString(inputString);
    }
}
