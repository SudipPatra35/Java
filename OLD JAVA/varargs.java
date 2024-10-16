// Example of varargs :

public class varargs {
    // static int sum(int a, int b){
    // return a+b;
    // }
    // static int sum(int a, int b,int c){
    // return a+b+c;
    // }
    // static int sum(int a, int b, int c, int d){
    // return a+b+c+d;
    // }
    static int sum(int x, int... arr) {
        // arr is available here as int [] arr
        int result = x;
        for (int a : arr) {
            result = result + a;
        }
        return result;
    }

    public static void main(String[] args) {
        // System.out.println("Sum of nothing is : "+sum());
        System.out.println("Sum of 1 is : " + sum(1));
        System.out.println("The sum of 2 & 3 is: " + sum(2, 3));
        System.out.println("The sum of 2 , 3 , 4 is: " + sum(2, 3, 4));
        System.out.println("The sum of 2 , 3 , 4, 5 is: " + sum(2, 3, 4, 5));
    }
}
