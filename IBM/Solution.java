class Solution {
 public static int sameSubstring(String s, String t, int K) {
     int n = s.length();
     int maxLen = 0;
     int cost = 0;
     int start = 0;

     for (int end = 0; end < n; end++) {
         cost += Math.abs(s.charAt(end) - t.charAt(end));
         while (cost > K) {
             cost -= Math.abs(s.charAt(start) - t.charAt(start));
             start++;
         }
         maxLen = Math.max(maxLen, end - start + 1);
     }

     return maxLen;
 }

 public static void main(String[] args) {
     String s = "adpgki";
     String t = "cdmxki";
     int K = 6;
     System.out.println(sameSubstring(s, t, K)); // Output: 3

     s = "uaccd";
     t = "gbbeg";
     K = 4;
     System.out.println(sameSubstring(s, t, K)); // Output: 3
 }
}
