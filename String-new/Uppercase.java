public class Uppercase {
 public static String toUpperCaseString(String str) { 
  StringBuilder sb = new StringBuilder("");
  
  char ch = Character.toUpperCase(str.charAt(0));
  sb.append(ch);
  for(int i = 1; i < str.length(); i++){
   if(str.charAt(i) == ' ' && i < str.length() - 1){
    sb.append(str.charAt(i));
    i++; // skip the space
    sb.append(Character.toUpperCase(str.charAt(i)));
   }
   else{
    sb.append(Character.toLowerCase(str.charAt(i)));
   }
  }
  return sb.toString();
 }
 public static void main(String[] args) {
  String str =  "capiTalIze tHe titLe";
  System.out.println(toUpperCaseString(str));
 }
}
