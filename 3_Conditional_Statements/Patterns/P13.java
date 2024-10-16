import java.util.*;
/* Pattern :   
               * * * *            and       * * * *   
               * * *                          * * * 
               * *                              * * 
               *                                  *
 */
public class P13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number  of rows : ");
        int r = sc.nextInt();
        for (int i=1;i<=r;i++){
            for(int j=1;j<=r-i+1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }


        // For 2nd Parttern
        for (int i=1;i<=r;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print("   ");
            }
            for (int k=1;k<=r-i+1;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

