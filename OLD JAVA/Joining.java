class OuterClass {
    int x = 10;
    
    // static class  InnerClass {
    class  InnerClass {
        int y = 5;
    }
}

public class Joining {
    public static void main(String[] args) {
           OuterClass myOuter = new OuterClass();
           OuterClass.InnerClass myInner = myOuter.new InnerClass();
    // OuterClass.InnerClass myInner = new OuterClass.InnerClass();
           System.out.println(myInner.y + myOuter.x);
    // System.out.println(myInner.y );
    }
}
