import java.util.Scanner; //importing scanner package

class perfect {
 public static void main(String args[]) {
  int n, sum = 0;
  System.out.println("Enter a number : ");
  Scanner SC = new Scanner(System.in); // to take input at runtime
  n = SC.nextInt();
  for (int i = 1; i < n; i++) {
    if (n % i == 0) // if our number is divisible by any number
    {
      sum = sum + i;
    }
   }
  if (n == sum)
   System.out.println("It is Perfect number");
  else
   System.out.println("It is not Perfect number");
 }
}
