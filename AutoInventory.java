import java.util.Scanner;
import java.util.ArrayList;

//VEHICLE DATA CLASS START
public class VehicleData {
    
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    //Default constructor
    public VehicleData() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.color = "Unknown";
        this.year = 0;
        this.mileage = 0;
    }
    //Parameterized constructor
    public VehicleData(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }    
    //'Make' getter & setter
    public String getMake() {
        return make;
    }    
    public void setMake(String make) { 
         this.make = make;
    //'Model' getter & setter
    }    
    public String getModel() {
        return model;
    }    
    public void setModel(String model) { 
         this.model = model;
    }    
    //'Color' getter & setter
    public String getColor() {
        return color;
    }    
    public void setColor(String color) { 
         this.color = color;
    }
    //'Year' getter & setter
    public int getYear() {
        return year;
    }    
    public void setYear(int year) { 
         this.year = year;
    }
    //'Mileage' getter & setter
    public int getMileage() {
        return mileage;
    }    
    public void setMileage(int mileage) { 
         this.mileage = mileage;
    }
}
//VEHICLE DATA CLASS END

// MAIN CLASS START
public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int choice; //For menu selection
    char confirm; //For confirming inventory data entry

    do {
        System.out.println("----Vehicle Inventory Menu----");
        System.out.println("1 - Add vehicle");
        System.out.println("2 - Remove vehicle");
        System.out.println("3 - Edit vehicle");
        System.out.println("4 - View inventory");
        System.out.println("5 - Exit program");
        System.out.println("Enter the number of your choice: ");

        choice = scnr.nextInt();

        switch (choice) {
            //Add vehicle
            case '1': 
                System.out.println("----Add vehicle----");
                VehicleData addVehicle = new VehicleData();
               
                try {
                    System.out.println("Enter vehicle make: ");
                    String make = scnr.next();
                    addVehicle.setMake(make);
                    
                    System.out.println("Enter vehicle model: ");
                    String model = scnr.next();
                    addVehicle.setModel(model);

                    System.out.println("Enter vehicle color: ");
                    String color = scnr.next();
                    addVehicle.setColor(color);

                    System.out.println("Enter vehicle year as a number: ");
                    int year = scnr.next();
                    addVehicle.setYear(year);

                    System.out.println("Enter vehicle mileage as a whole number: ");
                    int mileage = scnr.next();
                    addVehicle.setMileage(mileage);

                    System.out.println("----Confirm data entry----");
                    System.out.println(addVehicle.getMake() + ", " + addVehicle.getModel() + ", " + addVehicle.getColor() + ", " + addVehicle.getYear() + ", " + addVehicle.getMileage());
                    System.out.println("Add to inventory? Enter Y to add or N to start over");

                    confirm = scnr.next();

                    if (confirm == "Y" || confirm == "y") {
                        //add to arraylist in inventory class...
                        System.out.println("Vehicle added successfully.");
                    } else if (confirm == "N" || confirm == "n") {
                        System.out.println("Inventory entry cancelled. Please try again.");
                        //return to beginning of case '1' 
                    }
                }
            }
        }
    
