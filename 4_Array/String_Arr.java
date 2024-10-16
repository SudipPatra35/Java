import java.util.*;
//Q: Take an array of names as input from the user and print them on the screen.
public class String_Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();
        String names[]= new String[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter name : ");
            names[i]=sc.next();
        }
        System.out.print("[ ");
        for (int i=0;i<size;i++){
            System.out.print(names[i]+" "); 
        }
        System.out.println("]");
        sc.close();
    }
}
