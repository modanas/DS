public class SuperK {
 public static void main(String[] args) {
   Child c = new Child();
   System.out.println(c.name);
 }
}
class Parent {
 String name;
 Parent() {
  System.out.println("Parent Constructor");
 }
}
class Child extends Parent {
 Child() {
  super.name = "Baap";
  System.out.println("Child Constructor");
 }
}