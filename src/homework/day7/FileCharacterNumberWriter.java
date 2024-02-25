package homework.day7;

import homework.day5.stringtask.DateTimeFormater;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileCharacterNumberWriter {
    public void writeCharactersNumberToFile() {
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            in = new BufferedReader(new FileReader("output.txt"));
            String line;
            int counterChars = 0;
            while ((line = in.readLine()) != null) {
                counterChars += line.length();
            }
            out = new BufferedWriter(new FileWriter(fileNameGenerator(counterChars)));
            out.write(Integer.toString(counterChars));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private String fileNameGenerator(int charNumber) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
        return localDateTime.format(formatter) + "_" + charNumber;
    }

    public static void main(String[] args) {
        new FileCharacterNumberWriter().writeCharactersNumberToFile();
    }
}
