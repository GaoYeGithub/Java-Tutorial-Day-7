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