class NewThread1 extends Thread{
    public void run (){
        int i = 0;;
        while (i<100) {
            System.out.println("Thank You : ");
            i++;
        }
    }
}
class NewThread2 extends Thread{
    public void run (){
        int i = 0;;
        while (i<100) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Theard 2 ");
            i++;
        }
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
        NewThread1 t1 = new NewThread1();
        NewThread2 t2 = new NewThread2();
        t1.start();
        try {
            t1.join(); // Use to fully execute of t1, after that execute t2...
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
    }
    
}
