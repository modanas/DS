public class SecondRowSum {
 public static void main(String[] args) {
  int arr[][] = {{4, 7, 8}, {8, 8, 7}, {1, 2, 3}};
  int sum = 0;

//sum of 2nd row elements
   for(int j = 0; j < arr[0].length; j++) {
    sum += arr[1][j];
   }
  
  System.out.println("Sum of second row is : " + sum);
 }
}
