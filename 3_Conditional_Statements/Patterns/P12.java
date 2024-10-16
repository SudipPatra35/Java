import java.util.*;
/* Pattern :   
                     * 
                   * * 
                 * * * 
               * * * *
 */
public class P12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();
        for (int i=1;i<=r;i++){
            for(int j=i;j<=r-1;j++){
                System.out.print("   ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

