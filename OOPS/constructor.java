public class constructor {
 public static void main(String[] args) {
 Student s1 = new Student("Anas",23);
 s1.name = "Anas";
 s1.age = 22;
 s1.password = "1234";
 System.out.println(s1.name + " " + s1.age);
 
 Student s2 = new Student(s1);
 s2.password = "1234";
 }
}

class Student {
  String name;
  int age;
  String password;

  Student(Student s1) {
    this.name = s1.name;
    this.age = s1.age;
    // this.password = s1.password;
  }

  //parameterized constructor
  Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  //non-parameterized constructor
  Student() {
   System.out.println("This is a non-parameterized constructor");
  }
 }
  