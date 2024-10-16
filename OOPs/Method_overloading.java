public class Method_overloading {
    public int sum(int x, int y) {
        return (x + y);
    }

    public int sum(int x, int y, int z) {
        return (x + y + z);
    }

    public double sum(double x, double y) {
        return (x + y);
    }

    public static void main(String[] args) {
        Method_overloading sc = new Method_overloading();
        System.out.println(sc.sum(1, 3));
        System.out.println(sc.sum(1, 3, 5));
        System.out.println(sc.sum(1.5, 3.6));
    }
}