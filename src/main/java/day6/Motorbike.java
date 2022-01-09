package day6;

public class Motorbike {
    String model;
    String color;
    int yearOfIssue;

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

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - yearOfIssue);
    }
}
