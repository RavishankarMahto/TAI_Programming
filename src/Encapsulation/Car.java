package Encapsulation;

import java.util.Scanner;
import java.time.Year;
import java.util.*;

class Car1 {
    // Private attributes
    private String make;
    private String model;
    private int year;
    private float price;

    // Setter methods with validation
    public void setMake(String make) {
            this.make = make;
        }
    public void setModel(String model) {
            this.model = model;
        }
    public void setYear(int year) {
            this.year = year;
        }
    public void setPrice(float price) {
            this.price = price;
        }

    // Getter methods
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public float getPrice() {
        return price;
    }
}

public class Car {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car1 car = new Car1();

        // Take input and set attributes using setters
        car.setMake(scanner.nextLine());
        car.setModel(scanner.nextLine());
        car.setYear(scanner.nextInt());
        car.setPrice(scanner.nextFloat());

        // Output the car details using getter methods
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println(car.getPrice());
    }
}
