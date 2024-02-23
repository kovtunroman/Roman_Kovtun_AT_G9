package homework.day7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromConsoleWriteToFile {
    public void readFromConsoleWriteToFile() {
        Scanner scanner = new Scanner(System.in);
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
            out.write(scanner.nextLine());
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new ReadFromConsoleWriteToFile().readFromConsoleWriteToFile();
    }
}
