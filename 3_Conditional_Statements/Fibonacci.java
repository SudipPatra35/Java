import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the range : ");  
      int n = sc.nextInt();
      int fib=0;
      int first=0;
      int second=1;
      System.out.print(first+"  "+second+"  ");
      for(int i=2;i<n;i++){
        fib=first+second;
        first=second;
        second=fib;
        System.out.print(fib+"  ");
      }
      // For nth Fibonacci Number : 
      System.out.println("\nThe "+n+"th fibonnaci number is : "+ fib);
    }
}
