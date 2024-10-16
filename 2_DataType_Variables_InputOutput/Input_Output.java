import java.util.*;
public class Input_Output {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your roll number ");
    int roll = sc.nextInt(); 
    System.out.println("Your Roll is : "+roll);

    System.out.println("Enter full name");
    String fulle = sc.nextLine(); // Takes entire sequence of characters
    System.out.println("Enter first name");
    // String fname = sc.next(); // Takes sequence of characters before a space
    System.out.println("Your first name is And full name is "+fulle);
    }
}
