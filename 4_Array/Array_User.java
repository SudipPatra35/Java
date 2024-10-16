import java.util.*;

public class Array_User {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size;
    System.out.println("Enter the size of array : ");
    size = sc.nextInt();
    int numbers[]= new int[size];
    for (int i=0;i<size;i++){
        System.out.print("Enter number : ");
        numbers[i]=sc.nextInt();
    }
    System.out.print("[ ");
    for (int i =0;i<size;i++){ 
        System.out.print(+numbers[i]+" ");
    }
    System.out.print("]");
    sc.close();
  }
}
