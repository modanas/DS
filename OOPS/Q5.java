public class Q5{
 public static void main(String[] args) {
  Test t = new Test();
  t.set_Marks(88);
  System.out.println(Test.marks);
 }
}
class Test {
 static int marks;
  
 void set_Marks(int marks) {
  this.marks = marks;
 }
}