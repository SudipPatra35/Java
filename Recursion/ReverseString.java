public class ReverseString {
    static void rev(int index ,String str){
        if(index==0){
            System.out.print  (str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        rev(index-1, str);
    }
    public static void main(String[] args) {
        String str = "Sudip";
        rev(str.length()-1, str);
    }
}
