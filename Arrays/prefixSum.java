import java.util.*;

public class prefixSum {
 public static void printSubArrays(int numbers[]) {
  int currSum = 0;
  int MaxSum = Integer.MIN_VALUE;
  int prefix[] = new int[numbers.length];
  prefix[0] = numbers[0];

  //calculate prefix array
  for(int i = 1; i< prefix.length; i++) {
   prefix[i] = prefix[i-1] + numbers[i];
  }

  for (int i = 0; i < numbers.length; i++) {
   int start = i;  //1
   for (int j = i; j < numbers.length; j++) {
    int end = j;
    currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
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