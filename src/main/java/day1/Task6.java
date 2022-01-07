package day1;

public class Task6 {
    public static void main(String[] args) {
        int k = 8;          //Просили называть переменные осмысленно, но ТЗ против =)
        int serial = 1;

        while (serial < 10) {
            System.out.println(serial + " x " + k + " = " + serial * k);
            serial++;
        }
    }
}