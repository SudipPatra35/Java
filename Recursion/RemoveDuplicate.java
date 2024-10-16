public class RemoveDuplicate {
    static boolean map[]=new boolean[26];
    static void rmDuplicate(String str,int index,String newString){
        if(index==str.length()){
            System.out.println("After Removing duplicates : "+newString);
            return;
        }
        char current=str.charAt(index);
        if(map[current-'a']==true){
            rmDuplicate(str, index+1, newString);
        }else{
            newString+=current;
            map[current-'a']=true;
            rmDuplicate(str, index, newString);
        }
    }
    public static void main(String[] args) {
        String str = "SudipPatra";
        rmDuplicate(str.toLowerCase(), 0, "");

    }
}
