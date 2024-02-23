package homework.day7;

import java.util.Scanner;

public class ReaderFromConsole {
    public void readFromConsoleAdnPrintToConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf( "Hello, I just got '%s' from you!", scanner.nextLine()).println();
    }

    public static void main(String[] args) {
        new ReaderFromConsole().readFromConsoleAdnPrintToConsole();
    }
}
