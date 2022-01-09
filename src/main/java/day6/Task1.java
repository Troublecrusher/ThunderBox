package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car("Tatra", "Indigo", 1976);
        Motorbike motorbike = new Motorbike("H&D Breakout", "Vivid Black", 1985);

        System.out.println(motorbike.getModel());
        System.out.println(motorbike.getColor());
        System.out.println(motorbike.getYearOfIssue());
        motorbike.info();

        System.out.println(motorbike.yearDifference(1980));

        System.out.println();

        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getYear());
        car.info();

        System.out.println(car.yearDifference(1980));
    }
}
