import java.util.Scanner;
import java.util.ArrayList;

//VEHICLE DATA CLASS START
public class VehicleData {
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

//Default constructor for vehicle data
    public VehicleData() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.color = "Unknown";
        this.year = 0;
        this.mileage = 0;
    }

//Parameterized constructor for vehicle data
    public VehicleData(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }
}
//VEHICLE DATA CLASS END
