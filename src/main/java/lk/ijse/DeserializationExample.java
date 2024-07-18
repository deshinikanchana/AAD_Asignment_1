package lk.ijse;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) {
        Employee deserializedEmp = null;

        try (FileInputStream fileIn = new FileInputStream("employee.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            deserializedEmp = (Employee) in.readObject();
            System.out.println("\n\nDeserialization successful !!!\n" + deserializedEmp);
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
    }
}
