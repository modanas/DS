public class CompileTimePolymorphism {
 public static void main(String[] args) {
  Calculator calc = new Calculator();
  System.out.println(calc.sum(2, 4));
  System.out.println(calc.sum((float)2.3, (float)4.5));
  System.out.println(calc.sum(2, 4, 6));
 }
}

class Calculator{
 int sum(int a, int b) {
  return a + b;
 }

 float sum(float a, float b) {
  return a + b;
 }

 int sum(int a, int b , int c) {
  return a + b + c;
 }
}