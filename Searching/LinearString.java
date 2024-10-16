public class LinearString {
    static int LinSearch(String s,char target){
        if(s== null){
            return  0;
        }else{
            for(int i =0;i<s.length();i++){
                if(target == s.charAt(i)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "Sudip Patra";
        char target = 'n';
        int result = LinSearch(str, target);
        if(result==0){
            System.out.println("String is Empty");
            
        }else if(result==-1){
            System.out.println("Char not found..");
        }else{
            System.out.println("Index is : "+result);
        }
    }
}
