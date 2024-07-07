# Day 7 of Java Summer Tutorial

## Object-Oriented Programming 

OOP for short is a greate way to organize and write code based of concept of "objects" it based of 4 main principles:

1. Encapsulation: Or a single unit called a class containg data and function like what we learned before
2. Abstraction: Showing the essentail features of a object
3. Inheritance: Allow a new class to inherit properties and functions froma existing class
4. Polymorphism: Objects can be tread as a istance of their parent class


Here is a example of Class and Objects

However before we start we need to create a new file in the folder java it should already be there

ID.java
```java
public class ID {
    // Attributes of the class
    String fname;
    String lname;
    int age;

    // Constructor to initialize objects
    public ID(String fname, String lname, int age) {        
        this.fname = fname; // Now fname is a valid field
        this.lname = lname;
        this.age = age;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
        System.out.println("Age: " + age);
    }
}
```

Main.java
```java
// Main class to run code
public class Main {
    public static void main(String[] args) {
        // Creating an object of the ID class
        ID info = new ID("Gary", "Ye", 16);

        // Calling the method to display details
        info.displayDetails();
    }
}
```