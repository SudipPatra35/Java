import java.util.*;

public class Linear_Search {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size;
    System.out.print("Enter the size of array : ");
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
    System.out.println("]");

    System.out.print("Enter the number to find : ");
    int x = sc.nextInt();
    for(int i=0;i<numbers.length;i++){
        if(x==numbers[i]){
            System.out.println("The index of number is : "+i);
        }
    }
    sc.close();
  }
}
