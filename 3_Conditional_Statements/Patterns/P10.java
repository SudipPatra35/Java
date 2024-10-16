
/* Pattern :   
               1          or   A
               2 2             B B
               3 3 3           C C C
               4 4 4 4 
 */
import java.util.*;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        // For ABC
        char alp = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(alp + " ");
            }
            System.out.println();
            alp+=1;
        }
    }
}