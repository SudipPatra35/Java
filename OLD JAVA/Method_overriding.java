  class parent {
        void show() {
            System.out.println("Parent's Show");
        }
    }
    class child extends parent {
        void show() {
            System.out.println("Child's Show");
        }
    }
    public class Method_overriding {
    public static void main(String[] args) {
        parent sc = new parent();
        sc.show();
        child sc1 = new child();
        sc1.show();
    }
}
