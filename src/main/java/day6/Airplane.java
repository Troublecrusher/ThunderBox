package day6;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void setManufacturer(String userManufacturer) {
        manufacturer = userManufacturer;
    }

    public void setYear(int userYear) {
        year = userYear;
    }

    public void setLength(int userLength) {
        length = userLength;
    }

    public void setWeight(int userWeight) {
        weight = userWeight;
    }

    public void setFuel(int userFuel) {
        fuel = userFuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length +
                ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public void fillUp(int n) {
        fuel = fuel + n;
    }
}
