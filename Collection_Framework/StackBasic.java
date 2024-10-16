 import java.util.Stack;

public class StackBasic {
    public static void main(String[] args) {
        Stack<String> animal = new Stack<>();
        animal.push("Cat");
        animal.push("Dog");
        animal.push("Lion");
        System.out.println("Stack is : "+animal);
        String n = animal.peek();
        System.out.println("At the top is : "+n);
        animal.pop();
        System.out.println("After pop : "+animal);
    } 
}
