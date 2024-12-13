public class Q3{
 public static void main(String[] args) {
  Vehicle v = new Vehicle();
  v.runs();

  Vehicle v2 = new Car();
  v2.runs();
 }
}
class Vehicle {
  void runs() {
   System.out.println("Vehicle is Running");
  }
}
class Car extends Vehicle{
  void runs() {
   System.out.println("Car is Runnning");
  }
}