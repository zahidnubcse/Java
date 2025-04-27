class Vehicle {
    protected String brand = "BMW";

    public void honk() {
        System.out.println("Tut! Tut..");
    }
}

class Car extends Vehicle {
    private String carName = "Honda";

    void displayCarName() {  // <-- renamed method
        System.out.println("My Car Name: " + carName);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();          // Inherited from Vehicle
        myCar.displayCarName(); // Own method
    }
}
