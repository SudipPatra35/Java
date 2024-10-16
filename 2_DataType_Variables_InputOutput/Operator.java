class Operator{
    public static void main(String[] args) {
        int num1=10,num2=20,res;
        res=(num1>num2) ? num1:num2;
        System.out.println("Greater number is : "+res);

        // instanceof Operator :
        Operator op = new Operator();
        System.out.println(op instanceof Operator);
    }
}