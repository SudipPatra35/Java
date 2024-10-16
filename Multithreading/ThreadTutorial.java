class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<1000) {
            System.out.println("Hi I am Thread 1 ");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<1000) {
            System.out.println("This is Thread 2 in execution");
            i++;
        }
    }
}

public class ThreadTutorial{
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
} 