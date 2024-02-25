package homework.day8.util;

import java.util.List;

public class Printer {
    public static <T> void printListThroughSpaceForEach(List<T> inputList) {
        for (T element : inputList) {
            if (inputList.indexOf(element) == inputList.size() - 1) {
                System.out.print(element);
            } else {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    public static <T> void printListThroughSpaceIterateByIndex(List<T> inputList) {
        for (int i = 0; i < inputList.size(); i++) {
            if (i == inputList.size() - 1) {
                System.out.print(inputList.get(i));
            } else {
                System.out.print(inputList.get(i) + " ");
            }
        }
        System.out.println();
    }

    public static <T> void printListThroughNewLineIterateByIndex(List<T> inputList) {
        for (int i = 0; i < inputList.size(); i++) {
            System.out.println(inputList.get(i));
        }
        System.out.println();
    }

    public static <T> void printListThroughNewLineForEach(List<T> inputList) {
        for (T element : inputList) {
            System.out.println(element);
        }
    }

    public static <T> void printListThroughCommaIterateByIndex(List<T> inputList) {
        for (int i = 0; i < inputList.size(); i++) {
            if (i == inputList.size() - 1) {
                System.out.print(inputList.get(i));
            } else {
                System.out.print(inputList.get(i) + ", ");
            }
        }
        System.out.println();
    }

    public static <T> void printListThroughCommaForEach(List<T> inputList) {
        for (T element : inputList) {
            if (inputList.indexOf(element) == inputList.size() - 1) {
                System.out.print(element);
            } else {
                System.out.print(element + ", ");
            }
        }
        System.out.println();
    }

    private static <T> void printListThroughDashForEach(List<T> inputList) {
        for (T element : inputList) {
            if (inputList.indexOf(element) == inputList.size() - 1) {
                System.out.print(element);
            } else {
                System.out.print(element + "-");
            }
        }
        System.out.println();
    }
}
