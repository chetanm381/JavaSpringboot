
class Vehicle {
    protected String brand;
    protected int Speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.Speed = speed;
    }
    
    protected String showdetails() {
        
        return "Vehicle Name : \"" + this.brand + "\" Vehicle top Speed : \"" + this.Speed + "\"";
        
    }
}

class BMW extends Vehicle {

    protected String logo;

    BMW(String brand, int speed, String logo) {
        super(brand, speed);
        this.logo = logo;

    }
    public BMW(String brand, int speed) {
    
        super(brand, speed);
    }
    @Override
    protected String showdetails() {

        return "Vehicle Name : \"" + this.brand + "\" Vehicle top Speed : \"" + this.Speed + "\""
                + "\" Vehicle logo : \"" + this.logo + "\"";
        
    }
}

public class main {
    public static void main (String[] args) {
        Vehicle BMW_M5 = new BMW("BMW M5", 295);
        System.out.println(BMW_M5.showdetails());
    }
} 