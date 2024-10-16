/* Pattern :   
               1 1 1 1    or A A A A
               2 2 2 2       B B B B
               3 3 3 3       C C C C
               4 4 4 4       D D D D    
 */
import java.util.*;
public class P2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows and Column : ");
        int x = sc.nextInt();
        for (int i = 1;i<=x;i++){
            for(int j=1;j<=x;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
    // For ABC
        char alp = 65;
        for (int i = 1;i<=x;i++){
            for(int j=1;j<=x;j++){
                System.out.print(alp+" ");
            }
            System.out.println();
            alp+=1;
        }
    }
}
