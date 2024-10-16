/* Pattern :   
               1           or  A
               2 3             B C
               3 4 5           C D E
               4 5 6 7         D E F G
 */
import java.util.*;
public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
       int count =1;
        for (int i=1;i<=n;i++){
            count=i;
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count+=1;
            }
            System.out.println();
        }

         System.out.println();

        // For ABC
        char alp = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(alp + " ");
                alp += 1;
            }
            System.out.println();
            alp=65;
            alp+=i;
        }
    }
}