public class RmvDuplicates {
 public static String removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {
     if (idx == str.length()) {
         return newStr.toString();
     }
     char currChar = str.charAt(idx);
     if (map[currChar - 'a']) {
         return removeDuplicates(str, idx + 1, newStr, map);
     } else {
         map[currChar - 'a'] = true;
         return removeDuplicates(str, idx + 1, newStr.append(currChar), map);
     }
 }

 public static void main(String[] args) {
     String str = "appnnacollege";
     String result = removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
     System.out.println(result); // Output: "apncoleg"
 }
}
