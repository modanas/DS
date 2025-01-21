public class XToThePowerN {
 public static int myPow(int x, int n) {
  if(n == 0) {
   return 1;
  }
  return x * myPow(x, n - 1);
 }
 public static int optimizedPow(int a, int n) {
  if(n == 0) {
   return 1;
  }
  int halfPower = optimizedPow(a, n/2);
  int halfPowerSq = halfPower * halfPower;
  //if n is odd
  if(n % 2 != 0) {
   halfPowerSq = a * halfPowerSq;
  }
  return halfPowerSq;
 }
 public static void main(String[] args) {
  // System.out.println(myPow(2, 3));
  System.out.println(optimizedPow(2, 6));
 }
}