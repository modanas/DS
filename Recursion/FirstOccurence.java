public class FirstOccurence {
 public static int getFirstOccurence(int arr[],int i,int key) {
  if(i == arr.length) {
   return -1;
  }
  if(arr[i] == key) {
   return i;
  }
  return getFirstOccurence(arr,i+1,key);
 }
 public static int getLastOccurence(int arr[],int i,int key) {
   if(i == arr.length) {
    return -1;
   }
   int isFound = getLastOccurence(arr, i + 1, key);
   if(isFound == -1 && arr[i] == key) {
    return i;
   }

   return isFound;
 }
 public static void main(String[] args) {
  int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
  int key = 1;
  // System.out.println(getFirstOccurence(arr,0,key));
  System.out.println(getLastOccurence(arr,0,6));
 }
}
