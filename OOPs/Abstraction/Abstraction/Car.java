package Abstraction;
public abstract class Car {
    public abstract void accelerate();

    
    public abstract void breaking();
      
    //Concrete method: non abstract methods in abastract class
    public void wheel(){
        System.out.println("Car has 4 wheel");
    }

    // We can not create an object of abstract class..
    // Because it act as a concept ,
    //Child classes should have to ovverride the abstract methods.
}
