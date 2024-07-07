# Solution (No peeking!)


<details> <summary> 👀 Answer  </summary>

Stuent.java
```java
public class Student {
    String name;
    int age;
    String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Grade: " + grade);
    }

    public void changeGrade(String newGrade) {
        this.grade = newGrade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }
}
```
Main.java
```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Student> students = new ArrayList<Student>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Update Student Grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                  addStudent(scanner);
                  break;
                case 2:
                  displayStudents();
                  break;
                case 3:
                  updateStudentGrade(scanner);
                  break;
                case 4:
                  break;
            }
        } while (choice != 4);

        scanner.close();
    }

    static void addStudent(Scanner scanner) {
      System.out.print("Student Name: ");
      String name = scanner.nextLine();

      System.out.print("Student Age: ");
      int age = scanner.nextInt();

      scanner.nextLine();
      System.out.print("Student Grade: ");

      String grade = scanner.nextLine();

      Student newStudent = new Student(name, age, grade);
      students.add(newStudent);
    }

    static void displayStudents() {
        for (Student student : students) {
          student.displayDetails();
        }
    }

    private static void updateStudentGrade(Scanner scanner) {
        System.out.print("Enter student name to update grade: ");
        String name = scanner.nextLine();

        for (Student student : students) {
          if (student.getName().equalsIgnoreCase(name)) {
            System.out.print("Enter new grade: ");
            String newGrade = scanner.nextLine();
            student.changeGrade(newGrade);
            System.out.println("Grade updated successfully.");
            return;
        }
      }
      System.out.println("Student not found.");
    }
}
```
</details>