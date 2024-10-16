public class String_Buffer {
    public static void main(String[] args) {
        String str1 = "Sanjoy";//Immutable
        // System.out.println(str1.replace('a', 'z'));

        // StringBuffer : Mutable
        StringBuffer str2 = new StringBuffer("Sudip");
        System.out.println(str2.append(" Patra"));
        System.out.println(str2.insert(1, "Jay"));
        System.out.println(str2.delete(1,4));
        System.out.println(str2.replace(0,2, "Soumo"));
        System.out.println(str2.reverse());

    }
}
