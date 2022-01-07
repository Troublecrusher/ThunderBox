package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floorData = scanner.nextInt();

        if (floorData > 0 && floorData < 5) {
            System.out.println("Малоэтажный дом");
        } else if (floorData > 4 && floorData < 9) {
            System.out.println("Среднеэтажный дом");
        } else if (floorData > 8) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}