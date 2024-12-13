import java.util.*;

public class ArrayRotation {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int k = 3; 
        int n = arr.length;
        k = k % n;
        int rotated[] = new int[n];
        for (int i = 0; i < n - k; i++) {
            rotated[i] = arr[i + k];
        }
        for (int i = 0; i < k; i++) {
            rotated[n - k + i] = arr[i];
        }
        System.out.println(Arrays.toString(rotated));
    }
}
