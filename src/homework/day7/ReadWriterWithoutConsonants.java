package homework.day7;

import java.io.*;

public class ReadWriterWithoutConsonants {
    public void readFromFileDeleteConsonantsWriteToFile() {
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            in = new BufferedReader(new FileReader("output.txt"));
            String line;
            String resultString = "";
            while ((line = in.readLine()) != null) {
                if (!line.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "").equalsIgnoreCase("")) {
                    resultString += line.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "") + "\n";
                }
            }
            out = new BufferedWriter(new FileWriter("output.txt", true));
            out.write("\n\n" + resultString);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                out.close();
                in.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        new ReadWriterWithoutConsonants().readFromFileDeleteConsonantsWriteToFile();
    }
}
