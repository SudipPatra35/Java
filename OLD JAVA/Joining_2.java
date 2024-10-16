// class OuterClass {
//     int x = 10;

//     class InnerClass {
//         public int myInnerMethod(){
//             return x;
//         }
//     }
// }
// public class Joining_2 {
//    public static void main(String[] args) {
//     OuterClass myOuter = new OuterClass();
//     OuterClass.InnerClass myInner = myOuter.new InnerClass();
//     System.out.println(myInner.myInnerMethod());
//    }  
// }

class OuterClass{
    int x = 10;
    class InnerClass{
        public int myInnerMethod(){
            return x;
        }
    }
}
public class Joining_2 {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myInnerMethod());
  }
}
