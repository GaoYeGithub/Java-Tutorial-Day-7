# Constructors

What if you want to reuse the class will you can like this

ID.java
```java
public class ID {
    String fname;
    String lname;
    int age;

    public ID(String fname, String lname, int age) { 
      this.fname = fname; 
      this.lname = lname;
      this.age = age;
    }

    public void displayDetails() {
      System.out.println("First Name: " + fname);
      System.out.println("Last Name: " + lname);
      System.out.println("Age: " + age);
    }
}
```

Main.java
```java
public class Main {
    public static void main(String[] args) {
      ID id1 = new ID("Gary", "Ye", 16);
      ID id2 = new ID("Bob", "Jerry", 20);

      id1.displayDetails();
      id2.displayDetails();
    }
}
```

Try by yourself to change Jerry to Joe
