package Serialization;

import java.io.Serializable;

public class Student implements Serializable {

    public static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private String address;

    /**
     * transient means that if you do not want to serialize specific value, u can use transient type
     * check the output file it does not contain any email value.
     * */
    transient private String email;

    public Student(String name, int age, String address, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", address=" + address + '}';
    }
}
