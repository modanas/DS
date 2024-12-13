import java.util.*;

public class subArraySum {
 public static void printSubArrays(int numbers[]) {
  int currSum = 0;
  int MaxSum = Integer.MIN_VALUE;

  for (int i = 0; i < numbers.length; i++) {
   int start = i;  //1
   for (int j = i; j < numbers.length; j++) {
    int end = j;
    currSum = 0;
    for (int k = start; k <= end; k++) { 
     currSum +=numbers[k];  //sum of a sub-array
    }
    // System.out.print("Current Sum is :");
    System.out.println(currSum);
    if(MaxSum < currSum) {
     MaxSum = currSum;
    }
   }
  } //loop ends
  System.out.println();
  System.out.println("Max Sum: " + MaxSum);
 }

 public static void main(String[] args) {
  int numbers[] = { 1, -2, 6, -1, 3};

  printSubArrays(numbers);
 }
}
