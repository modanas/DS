public class SameSubstring {
    public static int sameSubstring(String s, String t, int K) {
        int n = s.length();
        int maxLength = 0, cost = 0, start = 0;

        for (int end = 0; end < n; end++) {
            cost += Math.abs(s.charAt(end) - t.charAt(end)); 

            while (cost > K) { 
                cost -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1); // Update max length
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(sameSubstring("hffk", "larb", 3)); // Output: 0
        System.out.println(sameSubstring("uaccd", "gbbeg", 4)); // Output: 3
        System.out.println(sameSubstring("abcd", "bcde", 2)); // Output: 2
        System.out.println(sameSubstring("zzzz", "aaaa", 10)); // Output: 2
        System.out.println(sameSubstring("adpgki", "cdmxki", 6)); // Output: 3
    }
}
