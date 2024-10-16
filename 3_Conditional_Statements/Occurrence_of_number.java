import java.util.*;
public class Occurrence_of_number {
  public static void main(String[] args) {
    //Find occurrence of 4 : 
    int num = 1454774524;
    int rem,count=0;
    while(num>0){
        rem = num % 10;
        num=num/10;
        if(rem==4){
            count+=1;
        }
    }
    System.out.println("Occurrence of 4 is : "+count);
  }  
}
