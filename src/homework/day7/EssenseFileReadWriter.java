package homework.day7;

import homework.day5.playground.essence.craft.air.Copter;

import java.io.*;

public class EssenseFileReadWriter {
    public void readEssenseObjectAndWriteToFile() {
        try (FileInputStream fis = new FileInputStream("object.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Copter copter = (Copter) ois.readObject();

            BufferedWriter out = new BufferedWriter(new FileWriter("objectLocation.txt"));
            out.write(copter.toString());
            out.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new EssenseFileReadWriter().readEssenseObjectAndWriteToFile();
    }
}
