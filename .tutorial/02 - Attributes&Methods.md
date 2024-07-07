# Class Attributes and Methods 

Now what if we want to change the Attributes well it you need to create a function that does that like this

👉 Type this line of code in `ID.java`

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

    // Method to change the age
    public void changeAge(int newAge) {
      this.age = newAge;
    }
}
```
👉 Type this line of code in `Main.java` and click run

```java
public class Main {
    public static void main(String[] args) {
        ID info = new ID("Gary", "Ye", 16);

        info.displayDetails();
        // Changing the age of the ID
        info.changeAge(17);

        // Displaying updated ID
        info.displayDetails();
    }
}

```

You can play around type, varabile names and other to get used to it, however if you change the class name remeber to also change the file name.