package systemNumbers;

public class Car {
    // Properties
    String color;
    String make;
    String model;
    
    // Method
    public void drive() {
    	
        System.out.println("The car is driving." +color);
    }
    
    public void stop() {
        System.out.println("The car has stopped.");
    }
    
    public static void main(String[] args) {
        // Creating instances of Car class
        Car car1 = new Car();
        car1.color = "Red";
        car1.make = "Toyota";
        car1.model = "Corolla";
        
        Car car2 = new Car();
        car2.color = "Blue";
        car2.make = "Honda";
        car2.model = "Civic";
        
        // Using methods of Car class
        car1.drive();
        car2.stop();
    }
}
