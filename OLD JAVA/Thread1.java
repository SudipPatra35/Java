import java.util.jar.Attributes.Name;

public class Thread1 implements Runnable {
    public void run() {
        System.out.println("Thread is running..");
    }

    public static void main(String[] args) {
        Runnable r1 = new Thread1();
        Thread th1 = new Thread(r1,"My New Thread");
        th1.start();
        String str = th1.getName();
        System.out.println(str);

    }
}
