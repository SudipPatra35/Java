class ExecptionHandling{
    public static void main(String[] args) {
        int a = 5;
        int b=0;
        int arr[]={1,2,3,4,5}; 
        try {
            // int result = a/b;
            // System.out.println("Result is : "+result);
            
                System.out.println(arr[6]);
            
        } catch (Exception e) {
            System.out.println(e+" Check Code");
        }
        finally{
            System.out.println("It is into the finally block.. It will runs always.... ");
        }
        System.out.println("It is very important code...");
        System.out.println("This code needs to run");
    }
}