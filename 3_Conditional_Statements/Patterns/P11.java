/* Pattern :   
               4         or  D
               3 4           C D
               2 3 4         B C D
               1 2 3 4       A B C D
 */
import java.util.*;
public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
       int count=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count+=1;
            }
            System.out.println();
            count=n-i;
        }

         System.out.println();

        // For ABC
        int alp = 65+(n-1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(alp) + " ");
                alp += 1;
            }
            System.out.println();
            alp=65+(n-1-i);
        }
    }
}