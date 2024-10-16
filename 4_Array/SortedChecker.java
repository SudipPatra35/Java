// Take an array of numbers as input and check if it is an array sorted in ascending order.
import java.util.*;

public class SortedChecker {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size;
    System.out.print("Enter the size of array : ");
    size = sc.nextInt();
    // int numbers[]={2,3,4,6,7,5};
    boolean flag = true;
    int numbers[]= new int[size];
   
    for (int i=0;i<size;i++){
        System.out.print("Enter number : ");
        numbers[i]=sc.nextInt();
    }
    System.out.print("[ ");
    for (int i =0;i<size;i++){ 
        System.out.print(+numbers[i]+" ");
    }
    System.out.println("]");

    for(int i=0;i<numbers.length-1;i++){
        if(numbers[i]>numbers[i+1] ){
            flag=false;
        }
    }
    if(flag==true){
        System.out.println("Array is Sorted");
    }else{
        System.out.println("Array is not sorted");
    }
    sc.close();
  }
}
