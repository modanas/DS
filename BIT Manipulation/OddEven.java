// import java.util.*;

public class OddEven {
 public static void oddOrEven(int n) {
  int bitMask = 1;
  if ((n & bitMask) == 0) {
   System.out.println("Even");
  } else {
   System.out.println("Odd");
  }
 }
 public static void main(String[] args){
   // Scanner sc = new Scanner(System.in);
   // int n = sc.nextInt();
   oddOrEven(7);
   oddOrEven(6);
   oddOrEven(13);
 }
}
