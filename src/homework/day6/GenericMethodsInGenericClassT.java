package homework.day6;

public class GenericMethodsInGenericClassT<T> {
    public void genericMethodOneGenArg(T inputT) {
        System.out.printf("I am an object of %s class", inputT.getClass().getSimpleName()).println();
    }

    public <G> String genericMethodTwoGenArgs(T inputTOne, G inputTTwo) {
        return "We are objects of " + inputTOne.getClass().getSimpleName() + " class and "
                + inputTTwo.getClass().getSimpleName() + " class";
    }

    public void genericMethodHalfGenArgs(T inputT, String inputString){
        System.out.printf("I got an object of %s class and string with %s characters",
                inputT.getClass().getSimpleName(), inputString.length()).println();
    }
}
