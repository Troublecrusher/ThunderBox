package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setModel("Tatra");
        car.setColor("Indigo");
        car.setYearOfIssue(1976);

        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getYearOfIssue());
    }
}