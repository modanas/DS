public class HierarchicalInheritance {
 public static void main(String[] args) {
  Bird c = new Bird();
  Fish b = new Fish();
  Mammal a = new Mammal();
  a.walk();
  b.swim();
  c.fly();
  c.eat();
  c.breathe();
 }
}

class Animal{
 void eat(){
  System.out.println("Eating...");
 }
 void breathe(){
  System.out.println("Breathing...");
 }
}
class Mammal extends Animal{
 void walk() {
  System.out.println("Walking...");
 }
}
class Fish extends Animal{
 void swim() {
  System.out.println("Swimming...");
 }
}
class Bird extends Animal{
 void fly() {
  System.out.println("Flying...");
 }
}
