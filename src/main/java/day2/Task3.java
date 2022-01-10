package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();

        if (firstNum >= secondNum) {
            System.out.println("Некорректный ввод");
        } else {
            int counter = firstNum + 1;

            while (counter < secondNum) {
                if (counter % 5 == 0 && counter % 10 != 0) {
                    System.out.print(counter + " ");
                }
                counter++;
            }
        }
    }
}
