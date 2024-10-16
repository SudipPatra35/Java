/*Consider a scenario where you have a superclass called Shape with fields color and filled, and methods getColor(), setColor(), isFilled(), and setFilled(). Now, you have two subclasses Circle and Rectangle that extend the Shape class.

Implement the Circle class with additional fields radius and appropriate constructors and methods.
Implement the Rectangle class with additional fields width and length, and appropriate constructors and methods.
Create a Java program that demonstrates inheritance by instantiating objects of both Circle and Rectangle classes, setting their properties, and invoking their methods.
Ensure that your program properly utilizes inheritance, including accessing superclass methods and fields from subclass objects. */
class Shape{
    String color ;
    boolean filled;
    String getColor(){
        return color;
    }
    void setColor(String color){
        this.color=color;
    }
    boolean isFilled(){
        return filled;
    }
    void setFilled(boolean fill){
        this.filled = fill;
    }

}
class Circle extends Shape{
    double radius;
    Circle(double radius,String color,boolean filled){
        super.setColor(color);
        super.setFilled(filled);
        this.radius= radius;
    }
    double Area(){
        return (22.7*2)*radius;
    }
}
class Rectangle extends Shape{
    double width;
    double length;
    Rectangle(double width,double length,String color,boolean filled){
        this.width= width;
        this.length= width;
        super.setColor(color);
        super.setFilled(filled);
    }
    double Area(){
        return width*length;
    }
}

public class PlayWithShapes {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.5, "Red", true);
        Rectangle r1 = new Rectangle(4, 5, "Blue", true);
        System.out.println("Area of circle 1 : "+c1.Area());
        System.out.println("Area of rectangle 1 : "+r1.Area());
        System.out.println("Is rerectangle 1 filled ? "+r1.isFilled());
        System.out.println("Color of Circle 1 is :  "+c1.getColor());
    }
    
}
