/* Pattern :   
               1 2 3 4 
               1 2 3 4 
               1 2 3 4
               1 2 3 4
 */
import java.util.*;
public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        // For Reverse
        
        // for (int i=1;i<=n;i++){
        //     for(int j=n;j>=1;j--){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
    }
}
