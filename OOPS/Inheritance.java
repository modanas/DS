public class Inheritance {
 public static void main(String[] args) {
    Dog bull = new Dog();
    bull.name = "Bull";
    bull.legs = 4;
    bull.color = "Brown";
    System.out.println(bull.name + " " + bull.legs + " " + bull.color);
 }
}

//Base class
class Animal{
 String color;

 void eat() {
  System.out.println("Eating...");
 }

 void breathe() {
  System.out.println("Breathing...");
 }
}

// //Derived class
// class Fish extends Animal{
//  int fins;

//  void swim() {
//   System.out.println("Swimming...");
//  }
// }

//Derived class
class Mammals extends Animal{
 int legs;
}

class Dog extends Mammals{
 String name;
}
