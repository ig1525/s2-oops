import java.util.Scanner;

class Vehicle {
    String mileage;
    float price;

    Vehicle(String mileage, float price) {
        this.mileage = mileage;
        this.price = price;
    }
}

class Car extends Vehicle {
    float ownershipCost;
    int warranty; 
    int capacity;
    String fuel;

    Car(String mileage, float price, float ownershipCost, int warranty, int capacity, String fuel) {
        super(mileage, price);
        this.ownershipCost = ownershipCost;
        this.warranty = warranty;
        this.capacity = capacity;
        this.fuel = fuel;
    }
}

public class Maruti extends Car {
    String model;

    Maruti(String mileage, float price, float ownershipCost, int warranty, int capacity, String fuel, String model) {
        super(mileage, price, ownershipCost, warranty, capacity, fuel);
        this.model = model;
    }

    void display() {
        System.out.println("Mileage: " + mileage + " /ltr");
        System.out.println("Price: " + price);
        System.out.println("Ownership Cost: " + ownershipCost);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Capacity: " + capacity);
        System.out.println("Fuel: " + fuel);
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Vehicle Details:");
        System.out.print("Mileage: ");
        String mileage = sc.next();
        System.out.print("Price: ");
        float price = sc.nextFloat();
        System.out.print("Ownership Cost: ");
        float ownershipCost = sc.nextFloat();
        System.out.print("Warranty (in years): ");
        int warranty = sc.nextInt();  
        System.out.print("Capacity: ");
        int capacity = sc.nextInt();
        System.out.print("Fuel Type: ");
        String fuel = sc.next();
        System.out.print("Model: ");
        String model = sc.next();

        Maruti maruti = new Maruti(mileage, price, ownershipCost, warranty, capacity, fuel, model);
        System.out.println("\nVehicle Information:");
        maruti.display();

        sc.close();
    }
}

