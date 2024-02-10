package basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn methodsReturnClassObject = new TrainMethodsReturn();
        System.out.println("метод returnNewInt вернул " + methodsReturnClassObject.returnNewInt(3));
        System.out.println("метод returnNewLong вернул " + methodsReturnClassObject.returnNewLong(3));
        System.out.println("метод returnNewChar вернул " + methodsReturnClassObject.returnNewChar('3'));
        System.out.println("метод returnNewFloat вернул " + methodsReturnClassObject.returnNewFloat(2));
        System.out.println("метод returnNewDouble вернул " + methodsReturnClassObject.returnNewDouble(2));
        System.out.println("метод returnNewShort вернул " + methodsReturnClassObject.returnNewShort((short) 1));
        System.out.println("метод returnNewByte вернул " + methodsReturnClassObject.returnNewByte((byte) 1));
        System.out.println("метод returnNewBoolean вернул " + methodsReturnClassObject.returnNewBoolean(true));
    }
}
