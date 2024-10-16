/* Pattern :   
               1 2 3 
               4 5 6  
               7 8 9 
 */
import java.util.*;
public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns : ");
        int n = sc.nextInt();
       int count =1;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(count+" ");
                count+=1;
            }
            System.out.println();
        }
    }
}
