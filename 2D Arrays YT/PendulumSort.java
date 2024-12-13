import java.util.*;

public class PendulumSort {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6}; 
        Arrays.sort(arr); 
        
        int n = arr.length;
        int pendulum[] = new int[n];
        int mid = (n - 1) / 2; 
        
        int left = mid, right = mid + 1;
        boolean placeLeft = true; 
        
        for (int i = 0; i < n; i++) {
            if (placeLeft) {
                pendulum[left--] = arr[i];
            } else {
                pendulum[right++] = arr[i];
            }
            placeLeft = !placeLeft; 
        }
        System.out.println(Arrays.toString(pendulum));
    }
}
