package oop;

public class Student {

    // properties
    String name;
    int age;
    String address;

//    CONSTRUCTOR

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    // if you create a class, you need a way to modify its properties, hence, getters and setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
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


    public String toString() {
        return ("Student name is " + this.getName() + ", address is " + this.getAddress() + " and age is " + this.getAge());
    }



    // main method

    public static void main(String[] args) {
        // object instantiation
        Student student1 = new Student("Jeremy", 34, "Rabat");
        System.out.println(student1.getAge());
    }

}
