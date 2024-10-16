import java.util.*;

/* Pattern :   
                      1 2 3 4 4 3 2 1
                      1 2 3 * * 3 2 1
                      1 2 * * * * 2 1
                      1 * * * * * * 1
 */
public class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number  of rows : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print(j+" ");
            }
            for (int k = 1; k <=(i*2)-2; k++) {
                System.out.print("* ");
            }
            for (int x = n-i+1; x >= 1; x--) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
