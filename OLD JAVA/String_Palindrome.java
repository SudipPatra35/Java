import java.util.*;
public class String_Palindrome {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    String s = sc.next();
    String x = s.toLowerCase();
    char[] n = x.toCharArray() ;
    int l = x.length();
    String temp = "";
    for(int i = l-1 ; i>=0; i--){   
      temp =temp + n[i];
    }
    System.out.println(temp);
if(temp.equals(x)){
    System.out.println("It is a Palindrome String.");
}
else{
    System.out.println("It is not a Palindrome String.");
} 
}
}
