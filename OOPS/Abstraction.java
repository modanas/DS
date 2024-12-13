public class Abstraction {
 public static void main(String[] args) {
  Mustang m = new Mustang();
  //Animal >> Horse >> Mustang
 }
}
abstract class Animal{
 String color;

 Animal() {
  System.out.println("Animal constructor called..");
 }
 void eat() {
  System.out.println("Eating...");
 }
 abstract void walk();
}

class Horse extends Animal{
 Horse() {
  System.out.println("Horse constructor called..");
 }
 void changeColor() {
  color = "DarkBrown";
 }
 void walk() {
  System.out.println("walks on 4 legs...");
 }
}

class Mustang extends Horse{
 Mustang() {
  System.out.println("Mustang constructor called..");
 }
}
class Gadha extends Animal{
 void changeColor() {
  color = "Gray";
 }
 void walk() {
  System.out.println("walks on 6 legs...");
 }
}