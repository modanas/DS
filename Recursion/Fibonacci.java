public class Fibonacci {
 public static int fibo(int n) {
   if(n == 0 || n == 1) {
    return n;
   }
   int fibn1 = fibo(n - 1);
   int fibn2 = fibo(n - 2);
   int fn = fibn1 + fibn2;
   return fn;
 }
 public static void main(String args[]) {
  System.out.print(fibo(10));
 }
}
