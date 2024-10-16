// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
import java.util.*;
public class Str_Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[5];
        String len ="";
        System.out.println("Enter strings : ");
        for (int i =0;i<arr.length;i++){
         arr[i]=sc.nextLine() ; 
        }
        for (int i =0;i<arr.length;i++){
            len=len+arr[i];
           }
        System.out.println("The cumulative (combined) length of all those strings is : "+len.length());
           sc.close();
    }
}
