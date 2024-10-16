class MyThreads extends Thread{
    MyThreads(String name){
        super(name);
    }
    public void run (){
        int i = 0;;
        while (i<100) {
            System.out.println("Thank You : "+getName());
            i++;
        }
    }
}
// MIN_PRIORITY = 0
// NORM_PRIORITY = 5
// MAX_PRIORITY = 10
public class Priority {
    public static void main(String[] args) {
        // MyThreads t1 = new MyThreads("Sudip 1");
        MyThreads t2 = new MyThreads("Normal Priority");
        MyThreads t3 = new MyThreads("Sudip 3 : Most important ..");
        // MyThreads t4 = new MyThreads("Sudip 4");
        MyThreads t5 = new MyThreads("Low");
        // t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        // t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        // t1.start();
        t2.start();
        t3.start();
        // t4.start();
        t5.start();
    }
}
