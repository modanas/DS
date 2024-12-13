import java.util.*;
public class linearSearch {
 public static int linSrch(int numbers[], int key) {
  for(int i = 0; i < numbers.length; i++) {
   if(numbers[i] == key) {
    return i;
   }
  }
   return -1;
 }
 public static void main(String[] args) {
  int numbers[] = {2,4,6,8,10,11,12,13,14,15,16};
  int key = 10;

  int index = linSrch(numbers, key);
  if(index == -1) {
   System.out.println("Key not found");
  }
  else {
   System.out.println("key is at index :" + " " + index);
  }
 }
}
