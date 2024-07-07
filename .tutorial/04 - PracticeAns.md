# Answer

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
    public void changelname(int lname) {
      this.lname = lname;
    }
}
```
👉 Type this line of code in `Main.java` and click run

```java
public class Main {
    public static void main(String[] args) {
        ID id1 = new ID("Gary", "Ye", 16);
        ID id2 = new ID("Bob", "Jerry", 20);

        id2.displayDetails();
        lname.changelname("Joe");
        id2.displayDetails();
    }
}

```