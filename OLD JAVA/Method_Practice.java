import java.util.Scanner;

// Problem 1 :
// public class Q_1 {
//  static void multiplication(int n){
//     int mul = 1;
//     for(int i=1; i <=n+1 ;i++){
//         mul = n*i;
//         System.out.println(n+" x "+i+" = "+mul);
//     }

//  }
//     public static void main(String[] args) {
//         int x = 9;
//         multiplication(x);
//     }
// }

// Problem 2 :
// public class Method_Practice {
//     static void star(int n) {
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println("Enter the line of Star : ");
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         star(x);
//     }
// }

// Problem 3 : 
// public class Method_Practice {
//     static int sum(int n) {
//         // Base Condition
//         if (n == 1) {
//             return 1;
//         } else {
//             return n + sum(n - 1);
//         }
//     }

//     public static void main(String[] args) {
//         System.out.println("Enter the range : ");
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         System.out.println("The sum is : " + sum(x));
//     }
// }

// Problem 4 :
// public class Method_Practice {
//     static void star(int n) {
//         for (int i = n; i >= 1; i--) {
//             for (int j = i; j >= 1; j--) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println("Enter the line of Star : ");
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         star(x);
//     }
// }

// Problem 5 :
// public class Method_Practice {
//     static int fib(int n) {
//         if (n == 1) {
//             return 0;
//         } 
//         else if (n == 2) {
//             return 1;
//         }
//         else{
//             return fib(n-1) + fib(n-2); 
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println("Enter the range of series: ");
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         System.out.println("The Fibonacci Series is: " + fib(x));
//     }
// }

// Problem 8 :
// public class Method_Practice {
//     static void star(int n) {
//         if(n>0){
//         star(n-1);
        // star(3)
        // star(2) + 3 star and new line 
        // star(1) + 2 star and new line + 3 star and new line
        // star(0) + 1 star and new line + 2 star and new line + 3 star and new line
//         for (int i = 1; i <= n; i++) {
//                 System.out.print("*");
//         }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println("Enter the line of Star : ");
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         star(x);
//     }
// }

// Problem 7 :
public class Method_Practice {
    static void star(int n) {
        if(n>0){
        star(n-1);
        for (int i = n; i >= 1; --i) {
                System.out.print("*");
        }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the line of Star : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        star(x);
    }
}