import java.util.*;
class JavaBasics {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a : ");
        int a = sc.nextInt();
        System.out.print("Enter number b : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of two number is : " +sum);
    }
}