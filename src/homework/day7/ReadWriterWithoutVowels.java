package homework.day7;

import java.io.*;

public class ReadWriterWithoutVowels {
    public void readFromFileDeleteVowelsWriteToFile() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("output.txt"));
            String line;
            String resultString = "";
            while ((line = in.readLine()) != null) {
                resultString += line.replaceAll("[aeiouAEIOU]", "") + "\n";
            }
            in.close();

            BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
            out.write(resultString);
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new ReadWriterWithoutVowels().readFromFileDeleteVowelsWriteToFile();
    }
}
