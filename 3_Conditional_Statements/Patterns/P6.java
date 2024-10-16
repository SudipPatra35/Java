
/* Pattern :   
               1           or A
               2 3            B C
               4 5 6          D E F
               7 8 9 10       G H I J
 */
import java.util.*;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count += 1;
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
        }
    }
}
