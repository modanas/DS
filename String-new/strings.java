import java.util.*;

public class strings {

 public static void strLngth(String str) {
  for (int i = 0; i < str.length(); i++) {
   System.out.print(str.charAt(i) + " ");
  }
  System.out.println();
 }
 public static void main(String args[]) {
  // char arr[] = { 'a', 'b', 'c', 'd', 'e' };
  // String str = "abcd";
  // String str2 = new String("xyz");
  // Scanner sc = new Scanner(System.in);
  // String name;
  // name = sc.nextLine();
  // System.out.println(name);

  String firstName = "Md";
  String lastName = "Anas";
  String fullname = firstName + " " + lastName;
  strLngth(fullname);
 }
}