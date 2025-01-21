public class TilingProblem {
 public static int tile(int n) { //2 * n (floor size)
    //base case
    if(n == 0 || n == 1) {
     return 1;
    }
    //horizontal case
    int fnm2 = tile(n - 2); //2 * (n - 2) (floor size)

    //vertical case 
    int fnm1 = tile(n - 1); //2 * (n - 1) (floor size)
    int totalWays = fnm1 + fnm2;
    return totalWays;
 }
  public static void main(String[] args) {
   System.out.println(tile(5));
  }
}