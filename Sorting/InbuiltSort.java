import java.util.*;
public class InbuiltSort {
 public static void printArray(Integer arr[]) {
  for(int i = 0; i < arr.length; i++) {
   System.out.print(arr[i] + " ");
  }
  System.out.println();
 }
 public static void main(String[] args) {
  Integer arr[] = {7, 9, 6, 5, 8};
  Arrays.sort(arr, Collections.reverseOrder());
  printArray(arr);
 }
}
