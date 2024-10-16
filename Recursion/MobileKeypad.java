public class MobileKeypad {
    public static String keyPad[]={" ",".,?","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};  
    static void combination(String str,int index,String newString){
        if(str.length()==index){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        String keys= keyPad[currChar-'0'];
        for(int i=0;i<keys.length();i++){
            combination(str, index+1, newString+keys.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="34";
        combination(str, 0, "");

    }
}
