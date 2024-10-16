import java.util.*;
public class LinkedListBasic {
    public static void main(String[] args) {
        List <Integer> num = new LinkedList<>();
// i) add fucntion : add element at the end of the ArrayList 
        num.add(1);
        num.add(5);
        System.out.println(num);
        // add in a specific index 
        num.add(0,10);
        System.out.println("Num list is : "+num);
//ii) addAll(): add all the elements of a list 
        List <Integer> newList = new LinkedList<>();
        newList.add(3);
        newList.add(4);
        newList.add(89);
        // newList.addAll(num);
        // add in a specific index 
        newList.addAll(0, num);    
        System.out.println("NewList is : "+newList);
// iii) get() : get the element of particular position :
        int x = num.get(2);
        System.out.println("Element is : "+x);
// iv) remove() :  remove the element of given index : 
        // newList.remove(0);
        newList.remove(Integer.valueOf(89)); // Remove the particular element by passing its value
        System.out.println("Removed NewList is : "+newList);
// v) set() : to update or set the value to a particular index : 
        newList.set(2, 50);
        System.out.println("The new list after set is : "+newList);
// vi) contains : check the element is present or not : 
        System.out.println(newList.contains(50));
        System.out.println(newList.contains(100));
//  vii) clear () : To clear the list : 
//         num.clear();
//         System.out.println("Num is : "+num);



// Iterate a ArrayList: 
        for (int i =0;i<newList.size();i++){
            System.out.println("The element of new list is : " + newList.get(i));
        }
        //For each
        for (Integer i : newList){
            System.out.println("For each element is : "+i);
        }
        // Iterator :
        Iterator<Integer> it = newList.iterator();
        while(it.hasNext()){
            System.out.println("iterator : "+it.next());
        }
    }
}

