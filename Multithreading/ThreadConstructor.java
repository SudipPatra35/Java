class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
    public void run (){
        System.out.println("Thank You : ");
    }
}
class ThreadRunnable implements Runnable{
    
    public void run(){
        System.out.println("I am Runnable");
    }
}

public class ThreadConstructor {
    public static void main(String[] args) {
        MyThread t = new MyThread("Sudip");
        t.run();
        System.out.println("Name of thread is : "+t.getName());
        System.out.println("ID of thread is : "+t.threadId());
        ThreadRunnable bullet = new ThreadRunnable();
        Thread gun = new Thread(bullet,"Patra");
        gun.start();
        System.out.println("Name of thread is : "+gun.getName());
        System.out.println("ID of thread is : "+gun.threadId());
    }
}
