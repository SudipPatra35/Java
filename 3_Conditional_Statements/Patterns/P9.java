/* Pattern :   
               1 2 3 4    or A B C D
               2 3 4 5       B C D E
               3 4 5 6       C D E F
               4 5 6 7       D E F G    
 */
import java.util.*;
public class P9 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows and Column : ");
        int x = sc.nextInt();
        int count=1;
        for (int i = 1;i<=x;i++){
            count=i;
            for(int j=1;j<=x;j++){
                System.out.print(count+" ");
                count+=1;
            }
            System.out.println();
        }
        System.out.println();
    // For ABC
        char alp = 65;
        for (int i=1;i<=x;i++){
            for(int j=1;j<=x;j++){
                System.out.print(alp+" ");
                 alp+=1;
            }
            System.out.println();
            alp=65;
            alp+=i;
        }
    }
}
