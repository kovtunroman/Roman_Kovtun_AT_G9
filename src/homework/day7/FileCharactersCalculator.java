package homework.day7;

import java.io.*;

public class FileCharactersCalculator {
    public void readFileCalculateCharacters() {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("output.txt"));
            String line;
            int counterCars = 0;
            while ((line = in.readLine()) != null) {
                counterCars += line.length();
            }
            System.out.println(counterCars);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        new FileCharactersCalculator().readFileCalculateCharacters();
    }
}
