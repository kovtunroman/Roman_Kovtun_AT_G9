package homework.day2.basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf methodsIfClassObject = new TrainMethodsIf();
        System.out.println("метод returnNew вернул " + methodsIfClassObject.returnNewInt(7));
        System.out.println("метод returnNewLong вернул " + methodsIfClassObject.returnNewLong(3));
        System.out.println("метод returnNewChar вернул " + methodsIfClassObject.returnNewChar('t'));
        System.out.println("метод returnNewFloat вернул " + methodsIfClassObject.returnNewFloat(0.67F));
        System.out.println("метод returnNewDouble вернул " + methodsIfClassObject.returnNewDouble(45));
        methodsIfClassObject.returnNewBoolean(true);
    }
}
