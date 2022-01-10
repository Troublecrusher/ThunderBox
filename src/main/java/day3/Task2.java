package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double upperNum = scanner.nextDouble();
            double lowerNum = scanner.nextDouble();

            if (lowerNum == 0)
                break;

            System.out.println(upperNum / lowerNum);
        }
    }
}
