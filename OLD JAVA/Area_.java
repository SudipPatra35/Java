import java.util.Scanner;

public class Area_ {
    public double area(double r) {
        double z;
        z = (3.14) * r * r;
        return z;
    }

    public float area(float a) {
        float A;
        A = a * a;
        return A;
    }

    public double area(double x, double y) {
        return x * y;
    }

    public float area(int h, int b) {
        float T;
        T = 0.5f * (h * b);
        return T;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area_ s = new Area_();
        System.out.println("Enter the redius of Circle");
        double r = sc.nextDouble();
        System.out.println("Area of Circle is " + s.area(r));
        System.out.println("Enter the side of Square");
        float a = sc.nextFloat();
        System.out.println("Area of Square is " + s.area(a));
        System.out.println("Enter the Length & Width of Rectangle");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println("Area of Rectangle is " + s.area(x, y));
        System.out.println("Enter the Height & Base of Triangle");
        int h = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Area of Square is " + s.area(h, b));
    }
}