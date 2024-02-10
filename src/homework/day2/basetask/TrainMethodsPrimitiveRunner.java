package homework.day2.basetask;

public class TrainMethodsPrimitiveRunner {
    public static void main(String[] args) {
        TrainMethodsPrimitive methodsPrimitiveClassObject = new TrainMethodsPrimitive();
        methodsPrimitiveClassObject.printInt(11);
        methodsPrimitiveClassObject.printLong(111);
        methodsPrimitiveClassObject.printChar('f');
        methodsPrimitiveClassObject.printFloat(8.5F);
        methodsPrimitiveClassObject.printDouble(11.1);
        methodsPrimitiveClassObject.printShort((short) 1);
        methodsPrimitiveClassObject.printByte((byte) 1);
        methodsPrimitiveClassObject.printBoolean(true);
    }
}
