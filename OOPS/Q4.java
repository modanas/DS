public class Q4{
 public static void main(String[] args) {
  Vehicle ve = new Vehicle();
  ve.runs();

  Vehicle ve2 = new Car();
  ve2.speed();      //not allowed in java
 }
}
class Vehicle {
  void runs() {
   System.out.println("Vehicle is Running");
  }
}
class Car extends Vehicle{
  void speed() {
   System.out.println("Car has Speed");
  }
}