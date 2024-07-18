package lk.ijse;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args) {
        Employee employee = new Employee("E001","Deshini",24);

        try (FileOutputStream fileOut = new FileOutputStream("employee.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(employee);
            System.out.println("\n\nSerialization Successful !!!\n"+ employee);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
