import java.util.*;
public class String_Details {
public static void main(String[] args) {
    String str = "Sudip";
    String str1 = "           Patra            ";
    int len = str.length();
    String lcase = str.toLowerCase();
    String ucase = str.toUpperCase();
    String trimedString = str1.trim();
    String subString1= str.substring(2);
    String subString2= str.substring(2,4);
    String replace = str.replace("u", "n");
    String end = " Patra";
    
    System.out.println(str.concat(end));

    // System.out.println("String length is : "+len);
    // System.out.println("lcase is : "+lcase);
    // System.out.println("ucase is : "+ucase);
    // System.out.println("Trimed String is : "+trimedString);
    // System.out.println("SubString1 is : "+subString1);
    // System.out.println("SubString2 is : "+subString2);
    // System.out.println("Replace is : "+replace);

    // System.out.println(str.startsWith("Su"));
    // System.out.println(str.endsWith("Su"));

    //System.out.println(str.charAt(2));

    // String nstr= "Sanjoyjoy";
    // System.out.println(nstr.indexOf("j"));
    // System.out.println(nstr.indexOf("j",4));
    // System.out.println(nstr.indexOf("klkl"));

    // System.out.println(str.equals("Sudip"));
    // System.out.println(str.equals("Sanjoy"));
    // System.out.println(lcase.equals("Sudip"));
    // System.out.println(lcase.equalsIgnoreCase("Sudip"));



}
    
}