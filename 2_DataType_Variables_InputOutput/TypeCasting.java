public class TypeCasting {
    public static void main(String[] args) {
        int a =10;
        float f = 20.0f;
        float result = a*f;
        System.out.println("The result is "+result);
        int resInt = (int)(result);
        System.out.println("Result in Integer is : "+resInt);

        // Whenever we try to do operations with two different datatypes , the resultant datatype will be the higer sized datatype :
        // For example : int * float = float
        //               float * double = double  etc. etc.
    }
}
