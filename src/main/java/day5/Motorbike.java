package day5;

public class Motorbike {

    private String model;
    private String color;
    private String year;

    public Motorbike(String model, String color, String year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }
    
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public String getYear() {
        return year;
    }
}