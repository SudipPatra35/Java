import java.util.*;
/* Pattern :   
                            1
                          1 2 1
                        1 2 3 2 1
                      1 2 3 4 3 2 1
 */
public class P15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number  of rows : ");
        int r = sc.nextInt();
        for (int i=1;i<=r;i++){
            for(int j=i;j<=r-1;j++){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            for(int l=i-1;l>=1;l--){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}

