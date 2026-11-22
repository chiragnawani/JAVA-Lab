import java.util.*;
abstract class Vehicle{
    protected String model;
    protected int days;

    Vehicle(String model, int days){
        this.model = model;
        this.days = days;
    }
    abstract void calculateRent();
}
class Car extends Vehicle{
    Car(String model, int Days){
        super(model, days);
    }
    @Override
    int calculateRent(){
        return 1500*days;
    }

}
class Bike extends Vehicle{
    Bike(String model, int Days){
        super(model, days);
    }
    @Override
    int calculateRent(){
        return days*400;
    }
}
public class InterfaceAbstractVehicle{
    public static void main(String[] args){
        Vehicle[] v = {
            new Car("Hyundai Creta", 4),
            new Bike("Royal Enfield Classic 350", 5);
            new Car("Fortuner", 8);
        }
    }
}