package day5;

public class Motorbike {
    private final String model;
    private final String color;
    private final int yearOfIssue;

    public Motorbike(String model, String color, int yearOfIssue) {
        this.model = model;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }
}
