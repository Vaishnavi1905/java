abstract class Vehicle {
    abstract void start(); // Abstract method

    void fuel() {
        System.out.println("Fueling the vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}

public class Abstarction {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.fuel();
    }
}

//output
// Car starts with a key
// Fueling the vehicle
