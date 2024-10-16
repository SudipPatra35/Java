import java.util.ArrayList;

public class AutoBoxing_UnBoxing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Auto Boxing
        list.add(6);
        list.add(7);
        System.out.println("ArrayList : "+list);
        //Unboxing
        int a = list.get(0);
        System.out.println("Value at index 0 : "+a);
    }
}
