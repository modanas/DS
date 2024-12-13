public class Q2 {
 public static void main(String[] args) {
  Vehicle v = new Car();
  v.runs();
 }
}
class Vehicle {
 String name;
  public void runs() {
   System.out.println("Runnning");
  }
}
class Car extends Vehicle {
 public void runs() {
  System.out.println("Car is running");
 }
 public void test() {
  System.out.println("Testing");
 }
}