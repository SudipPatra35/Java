// Searching for an element x in a matrix
import java.util.*;
public class Searching_2DArray {
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
        System.out.print("Enter the number to find : ");
        int x =sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(number[i][j]==x){
                    System.out.println("The index is : numbers["+i+"]["+j+"]");
                }
            }
        }
        sc.close();
    
    }
}

