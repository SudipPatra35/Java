import java.util.Scanner;

public class Fibo {
 public int fibonacci(int n){
    if(n == 0 ){
        return 0;
    }
    else if(n==1){
        return 1;
    }
    else{
        return fibonacci(n-1)+fibonacci(n-2);
    } 
 }
    public static void main(String[] args) {
        int range;
        Fibo c = new Fibo();
        System.out.println("Enter the range : ");
        Scanner sc = new Scanner(System.in);
        range = sc.nextInt();
        c.fibonacci(range);
        for(int i = 0; i <= range ; i++){
            System.out.println(c.fibonacci(i)); 
        }
        
    }
}
