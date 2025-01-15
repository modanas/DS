class ContainerWithMostWater {
 public static int maxArea(int[] height) {
     int left = 0;
     int right = height.length - 1;
     int maxArea = 0;

     while (left < right) {
         int area = Math.min(height[left], height[right]) * (right - left);
         maxArea = Math.max(area, maxArea);

         if (height[left] < height[right]) {
             left++;
         } else {
             right--;
         }
     }
     return maxArea;
 }

 public static void main(String[] args) {
     int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
     System.out.println("Test Case 1: " + maxArea(height1)); // Expected: 49

     int[] height2 = {1, 1};
     System.out.println("Test Case 2: " + maxArea(height2)); // Expected: 1

     int[] height3 = {4, 3, 2, 1, 4};
     System.out.println("Test Case 3: " + maxArea(height3)); // Expected: 16

     int[] height4 = {1, 2, 1};
     System.out.println("Test Case 4: " + maxArea(height4)); // Expected: 2

     int[] height5 = {2, 3, 10, 5, 7, 8, 9};
     System.out.println("Test Case 5: " + maxArea(height5)); // Expected: 36
 }
}
