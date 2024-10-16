public class ExeptionExample {
    public static void main(String[] args) {

        // Arithmetic Exception :
        // try{
        // int data = 100/0;
        // }catch(ArithmeticException e){
        // System.out.println(e);
        // }
        // System.out.println("rest of code...");

        // Array Out of Bound Exception :
        // try{
        //     int[] myNumbers = { 1, 2, 3 };
        //     System.out.println(myNumbers[10]);
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        // System.out.println("Something went wrong");

        // Using Multiple Catch :
        // try{
        //     int array[] = new int[10];
        //     array[22]=95;
        //     array[10]=30/0;
        // }catch(ArithmeticException e){
        //     System.out.println(e.getMessage());
        // }catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println(e.getMessage());
        // }

        // Null Exception :
         try{
            String s = null;
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}