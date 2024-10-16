import java.util.*;
public class LinkedHashSetBasic {

    public static void main(String[] args) {
        Set <Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(50);
        set.add(20);
        set.add(70);
        set.add(80);
        set.add(40);
        set.add(40);// Will not be added, because of Duplicacy
        System.out.println("Set is : "+set);
        set.remove(40);
        System.out.println("After removing : "+set);
        System.out.println("Does contain 10 ? "+set.contains(10));
        System.out.println("Is Empty ? "+set.isEmpty());
        System.out.println("Size of set is : "+set.size());
    }
}

