import java.util.HashSet;

public class SubSequences {
    static void SubSeq(String str,int index,String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        //For exclude 
        SubSeq(str, index+1, newString);
        //For include
        char currChar = str.charAt(index);
        SubSeq(str, index+1, newString+currChar);

    }
    // Unique SubSequences
    static void UniqueSubSeq(String str,int index,String newString,HashSet<String> set){
        if(index==str.length()){
            if(set.contains(newString)==false){
                System.out.println(newString);
                set.add(newString);
                return;
            }else{
                return;
            }
        }
        //For exclude 
        UniqueSubSeq(str, index+1,newString,set);
        //For include
        char currChar = str.charAt(index);
       UniqueSubSeq(str, index+1, newString+currChar,set);

    }
    public static void main(String[] args) {
        String str1 = "abc";
        String str2="aaa";
        SubSeq(str1, 0, "");
        HashSet<String> set = new HashSet<>();
        UniqueSubSeq(str2, 0,"", set);
    }
}
