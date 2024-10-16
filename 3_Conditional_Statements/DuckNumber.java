import java.util.*;
class DuckNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int rem,flag=0;

        while(n>0){
            rem=n%10;
            if (rem==0) {
                System.out.println("It is a duck number.");
                flag =1;
                break;
            }
            n=n/10;
        }
        if(flag==0){
            System.out.println("It is not a duck number.");
        }
    sc.close();
    }
}