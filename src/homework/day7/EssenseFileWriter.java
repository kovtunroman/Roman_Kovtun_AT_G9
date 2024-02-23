package homework.day7;

import homework.day5.playground.essence.craft.air.Copter;

import java.io.*;

public class EssenseFileWriter {
    public void objectWriteToFile() {
        try (FileOutputStream fos = new FileOutputStream("object.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(new Copter(3000, "AH-1G"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new EssenseFileWriter().objectWriteToFile();
    }
}
