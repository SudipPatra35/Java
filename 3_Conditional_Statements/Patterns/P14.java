import java.util.*;
/* Pattern :   
               1 2 3 4  
                 2 3 4
                   3 4
                     4
 */
public class P14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number  of rows : ");
        int r = sc.nextInt();
        for (int i=1;i<=r;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for (int k=i;k<=r;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        
        // int c = 1;
        // for (int i=1;i<=r;i++){
        //     for(int j=i;j<=r-1;j++){
        //         System.out.print("  ");
        //     }
        //     for (int k=1;k<=i;k++){
        //         System.out.print(c+" ");
        //         c+=1;
        //     }
        //     System.out.println();
        // }
    }
}

