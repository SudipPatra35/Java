import java.util.*;
public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int columns = sc.nextInt();
        int number[][] = new int[rows][columns];
        System.out.println("Enter numbers : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                number[i][j]=sc.nextInt();
                // System.out.print("Enter numbers : ");
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    
    }
}
