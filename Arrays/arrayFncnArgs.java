import java.util.*;
public class arrayFncnArgs {
 public static void update(int marks[], int nonChanged){
  nonChanged = 10;
  for(int i = 0; i < marks.length; i++){
   marks[i] = marks[i] + 1;
  }
 }
   public static void main(String[] args) {
    int marks[] = {97, 98, 99};
    int nonChanged = 5;
    update(marks, nonChanged);

    System.out.println("Non changed: " + nonChanged);

    //print our marks
    for(int i = 0; i < marks.length; i++){
     System.out.print(marks[i] + " ");
    }
    System.out.println();
   }
}
