package Serialization;

import java.io.*;

public class Serialization {

    /**
     * In Java, serialization is the process of converting an object's state into a byte stream,
     * so it can be stored in a file, sent over a network, or transmitted through I/O streams.
     * The reverse process of reconstructing the object from a byte stream is called deserialization.
     *
     * To make an object serializable, the class must implement the java.io.Serializable interface.
     * Or
     * To make an object serializable, the class must implement the java.io.Externalizable subinterface.
     *
     * usecase - java object-> serialize into bytes -> send it into network
     * */

    public static void main(String[] args) {

        Student student = new Student("Nipun Madumal", 26, "185/7, Near the Court, Minuwangoda", "nipunmadumal18@gmail.com");

        String filePath = "D:/Tutorials/Advance Java/Serialization/Test.txt";
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        //serialization
        try {

            fileOutputStream = new FileOutputStream(filePath);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);

            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Serialization Successful for object :" + student);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        //deserialization
        try {

            fileInputStream = new FileInputStream(filePath);
            objectInputStream = new ObjectInputStream(fileInputStream);

            Student student1 = (Student) objectInputStream.readObject();

            System.out.println("De-serialization Successful for object :" + student1);
            System.out.println("De-serialized email:" + student1.getEmail()); // this gives null

            fileInputStream.close();
            objectInputStream.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
