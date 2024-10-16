import java.util.*;
public class Tranpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int columns = sc.nextInt();
        int number[][] = new int[rows][columns];
        int TranposeNumber[][] = new int[columns][rows];
        System.out.println("Enter numbers : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                number[i][j]=sc.nextInt();
                // System.out.print("Enter numbers : ");
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                TranposeNumber[j][i]=number[i][j];
            }
        }
        System.out.println("Tranpose matrix is : ");
        for(int i=0;i<columns;i++){
            for(int j=0;j<rows;j++){
                
                System.out.print(TranposeNumber[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    
    }
}
