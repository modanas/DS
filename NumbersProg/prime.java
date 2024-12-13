import java.util.*;

public class prime {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a number : ");
   int n = sc.nextInt();
   boolean isPrime = true;

   if(n == 2) {
    System.out.println(n + " is a Prime Number ");
   }
   else {
    for(int i = 2; i <= Math.sqrt(n); i++) {
      if(n % i == 0) {  //n is not a multiple of 1 and n
        isPrime = false;
      }
     }
      if(isPrime == true) {
        System.out.println(n + " is a Prime number");
      }
      else {
        System.out.println(n + " is a not a Prime number");
      }
   }
 }
}
