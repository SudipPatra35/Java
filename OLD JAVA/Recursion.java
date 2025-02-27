public class Recursion {

    static int factorial(int n) {
        // factorial(n) = n * factorial(n-1)
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
 
    static int factorial_iterative(int n){
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for(int i = 1; i<= n; i++){
                product = product *i;
            }
            return product;    
        }
    }
    public static void main(String[] args) {
        int x = 4;
        System.out.println("Factorial of x is : " + factorial(x));
        System.out.println("Factorial of x is : " + factorial_iterative(x));
    }
}
