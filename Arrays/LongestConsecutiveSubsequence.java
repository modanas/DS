import java.util.Arrays;

public class LongestConsecutiveSubsequence {
    public int findLongestConsecutive(int[] arr) {
        if (arr.length == 0) return 0;

        Arrays.sort(arr);
        int longest = 1, currentStreak = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                // Skip duplicates
                continue;
            } else if (arr[i] == arr[i - 1] + 1) {
                // If consecutive, increment the streak
                currentStreak++;
            } else {
                // If not consecutive, update the longest streak and reset current streak
                longest = Math.max(longest, currentStreak);
                currentStreak = 1;
            }
        }

        // Final check to ensure the last streak is considered
        return Math.max(longest, currentStreak);
    }

    public static void main(String[] args) {
        LongestConsecutiveSubsequence solution = new LongestConsecutiveSubsequence();

        int[] arr1 = {2, 6, 1, 9, 4, 5, 3};
        System.out.println("Longest Consecutive Subsequence Length: " + solution.findLongestConsecutive(arr1)); // Output: 6

        int[] arr2 = {1, 9, 3, 10, 4, 20, 2};
        System.out.println("Longest Consecutive Subsequence Length: " + solution.findLongestConsecutive(arr2)); // Output: 4

        int[] arr3 = {15, 13, 12, 14, 11, 10, 9};
        System.out.println("Longest Consecutive Subsequence Length: " + solution.findLongestConsecutive(arr3)); // Output: 7
    }
}
