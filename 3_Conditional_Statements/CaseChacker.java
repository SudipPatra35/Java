import java.util.*;

public class CaseChacker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char ch = sc.next().trim().charAt(0);
        if (ch>='a' && ch<='z'){
            System.out.println("Lower Case");
        }else{
            System.out.println("Upper Case");
        }
    }

}
