package day6;

public class Plane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Plane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Manufacturer: " + "manufacturer" + "\n" +
             "Year realise: " + year + "\n" + 
             "Length: " + length + "\n" + "Weight: " + weight + "\n" + 
             "Count of fuel: " + fuel
        );
    }

    public void fillUp(int n) { 
        fuel += n;
    } 
    
}
