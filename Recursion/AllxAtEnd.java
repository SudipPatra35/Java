public class AllxAtEnd {
    static int count=0;
    // static String newStr="";
    static void sentx(String str,int index,String newStr){
        if(index==str.length()){
            for(int i=1;i<=count;i++){
                newStr=newStr+"x";
            }
            System.out.println("The new String is : "+newStr);
            return;
        }
        if(str.charAt(index)=='x' ||str.charAt(index)=='X'){
            count++;
            sentx(str,index+1,newStr);
        }else{
            newStr=newStr+Character.toString(str.charAt(index));
            sentx(str,index+1,newStr);
        }
    }

    public static void main(String[] args) {
        String str = "abxcxxd";
        sentx(str, 0,"");
    }
}
