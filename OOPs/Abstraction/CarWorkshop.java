import Abstraction.*;


public class CarWorkshop {
    public static void RepairCar(Car car){
        System.out.println("Car has repaired");
    }
    public static void main(String[] args) {
        Audi ad= new Audi();
        WagnoR wg= new WagnoR();
        RepairCar(ad);
        RepairCar(wg);
    }
}
