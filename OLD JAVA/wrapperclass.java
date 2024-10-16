public class wrapperclass {
    public static void main(String[] args) {
        int a = 5;
        Double b = 5.65;
        Integer aObj = Integer.valueOf(a);
        Double bObj = Double.valueOf(b);
        if(aObj instanceof Integer){
            System.out.println("An object of Integer is Created");
        }
        if(bObj instanceof Double){
            System.out.println("An object of Double is Created");
        }
    }
}
