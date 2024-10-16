class MyThread1 implements Runnable{
    public void run(){
        int i=0;
        while (i<1000) {
            System.out.println("Hi I am Thread 1 ");
            i++;
        }
    }

}  

class MyThread2 implements Runnable{
    @Override
    public void run(){
        int i=0;
        while (i<1000) {
            System.out.println("This is Thread 2 in execution");
            i++;
        }
    }
}

public class ThreadInterface {
    public static void main(String[] args) {
        MyThread1 bullte1 = new MyThread1();
        Thread gun1 = new Thread(bullte1);
        MyThread2 bullte2 = new MyThread2();
        Thread gun2 = new Thread(bullte2);
        gun1.start();
        gun2.start();
    }
    
}
