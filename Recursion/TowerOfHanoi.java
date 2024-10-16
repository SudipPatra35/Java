public class TowerOfHanoi {
    static void toh(int n,String sour,String help ,String des){
        if(n==1){
            System.out.println("Move "+n+" from "+sour+" to "+des);
            return;
        }
        toh(n-1, sour, des, help);
        System.out.println("Move "+n+" from "+sour+" to "+des);
        toh(n-1, help, sour, des);
    }
    public static void main(String[] args) {
        toh(3,"S","H","D");
    }
}
