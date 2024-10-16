import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        String rev = "";
        // for (int i = 0;i<str.length()/2;i++){
        //     int front=i;
        //     int back = str.length()-1-i ; //back = len-1-i
        //     char frontchar= str.charAt(back);
        //     char backchar=str.charAt(front);
        //     str.setCharAt(front, frontchar);
        //     str.setCharAt(back, backchar);

        // }
        for(int i = str.length()-1;i>=0;i-- ){
            rev= rev+str.charAt(i);
        }
        System.out.println("The reverse string is : "+rev);
        sc.close();
    }
}
