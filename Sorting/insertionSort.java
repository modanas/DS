public class insertionSort {
 public static void Sort(int arr[]) {
   for(int i = 1; i < arr.length; i++) {
    int curr = arr[i];
    int prev = i - 1;
    //finding out the correct position for insertion
    while(prev >= 0 && arr[prev] > curr) {
     arr[prev+1] = arr[prev];
     prev--;
    }
    //insertion
    arr[prev + 1] = curr;
   }
 }
 public static void printArray(int[] arr) {
  for(int i = 0; i < arr.length; i++) {
   System.out.print(arr[i] + " ");
  }
  System.out.println();
 }
 public static void main(String[] args) {
  int arr[] = {5, 4, 1, 3, 2};
  Sort(arr);
  printArray(arr);
 }
}
