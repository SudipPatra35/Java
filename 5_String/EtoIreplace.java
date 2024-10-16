// Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”
import java.util.*;
public class EtoIreplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String orginal = sc.nextLine();
        String result="";
        for (int i = 0;i<orginal.length();i++ ){
            if(orginal.charAt(i)=='e' || orginal.charAt(i)=='E'){
                result=result+'i';
            }else{
                result=result+orginal.charAt(i);
            }
        }
        System.out.println("Result is : "+result);
        sc.close();
    }
}
