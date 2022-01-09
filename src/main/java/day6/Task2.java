package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2006, 71, 170000);

        airplane.setYear(2012);
        airplane.setLength(74);

        airplane.fillUp(12000);
        airplane.fillUp(8000);

        airplane.info();
    }
}
