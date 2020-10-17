package specialtest;

//Multilevel inheritance
class Vehicle {
    String name;
    Vehicle() {
        name = "Vehicle";
    }
}
class HeavyVehicle extends Vehicle {
    HeavyVehicle() {
        name = "HeavyVehicle";
    }
}
class Truck extends HeavyVehicle {
    Truck() {
        name = "Truck";
    }
}

public class InstanceOfExample {
    
    public static void main(String[] args) {
        boolean result;
        HeavyVehicle hV = new HeavyVehicle();
        Truck t = new Truck();
        HeavyVehicle hv2 = null;
        //instanceof operator called the 'type comparison operator' is used to check   
        //if an object belongs to a specific class, or implements a specific interface
        result = hV instanceof HeavyVehicle;
        System.out.println("hV is an HeavyVehicle: " + result);
        result = t instanceof HeavyVehicle;
        System.out.println("t is an HeavyVehicle: " + result);
        result = hV instanceof Truck;
        System.out.println("hV is a Truck: " + result);
        result = hv2 instanceof HeavyVehicle;
        System.out.println("hv2 is an HeavyVehicle: " + result);
        hV = t; //Successful Cast form child to parent
        t = (Truck) hV; //Successful Explicit Cast form parent to child
    }
}
