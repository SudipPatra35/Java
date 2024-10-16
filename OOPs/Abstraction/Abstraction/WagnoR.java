package Abstraction;

public class WagnoR extends Car {
    public WagnoR(){
        super.wheel();
    }
    @Override
    public void accelerate() {
        System.out.println("WagnoR is accelerating");
    }
    
    public void breaking() {
        
        System.out.println("WagnoR is accelerating");
    }
}
