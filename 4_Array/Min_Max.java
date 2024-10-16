// Find the maximum & minimum number in an array of integers.
import java.util.*;

public class Min_Max {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size;
    System.out.print("Enter the size of array : ");
    size = sc.nextInt();
    // int num[]={10,3,4,6,2,5,7};
    int numbers[]= new int[size];
    int min=numbers[0];
    int max=numbers[0];
    for (int i=0;i<size;i++){
        System.out.print("Enter number : ");
        numbers[i]=sc.nextInt();
    }
    System.out.print("[ ");
    for (int i =0;i<size;i++){ 
        System.out.print(+numbers[i]+" ");
    }
    System.out.println("]");

    for(int i=0;i<numbers.length;i++){
        if(min>numbers[i] ){
            min=numbers[i];
        }
        if(max<numbers[i]){
            max=numbers[i];
        }
    }
    System.out.println("Minimum number is : "+min);
    System.out.println("Maximum number is : "+max);
    sc.close();
  }
}

