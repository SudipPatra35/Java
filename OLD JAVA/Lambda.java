// Double getPiValue(){
//     return 3.1415
// }
import java.util.*;
//This is funtional Interface
@FunctionalInterface
interface Myinterface{
    // Abstract Method
    Double getPiValue();
}
public class Lambda {
public static void main(String[] args) {
// Declare a reference to MyInterface
Myinterface ref;
//Lambda Expression
ref = ()->3.1415;
  System.out.println("Value of Pi = "+ref.getPiValue());  
}
}
