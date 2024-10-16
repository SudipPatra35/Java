/*Primitive is that data types which can not be break further in other data types.
Suppose, String str = "Sudip" which can be break into 5 characters...
But we can not do so with int a = 10, char b = 'a'... So those are primitive
*/ 
class PrimitiveDataTypes{
    public static void main(String[] args) {

        int a = 10; //4 bytes
        char b = 'a'; // 1 byte
        float marks = 674.7f; //4 bytes
        double LargeDecimalNumber = 1454787454577758454.234; //8 bytes
        long largeInteger = 4548798754578745452L;  //8 bytes
        boolean c = true; 
        int money = 123_000_000;
        System.out.println(c);
        System.out.println(money);

        //  Non Primitive Data Type
        String str = "Sudip Patra";
    }
} 