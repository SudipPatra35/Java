import java.util.Scanner;

public class ToD_Array_Input {

  public static void main(String args[]) {
    int m, n, i, j;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    m = sc.nextInt();
    System.out.print("Enter the number of columns: ");
    n = sc.nextInt();
    int array1[][] = new int[m][n];
    int array2[][] = new int[m][n];
    System.out.println("Enter the elements of the array:");
    for (i = 0; i < m; i++) 
    for (j = 0; j < n; j++) 
    // int arr [i][j] = sc.nextInt();
    System.out.println("Elements of the array are: ");
    for (i = 0; i < m; i++) {
    for (j = 0; j < n; j++){ 
      // System.out.print(arr[i][j] + " ");
      System.out.println();
    }
    }
  }
}
