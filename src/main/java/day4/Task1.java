package day4;

import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int arrLength = scanner.nextInt();
        int[] arrayDefault = new int[arrLength];

        for (int i = 0; i < arrayDefault.length; i++) {
            arrayDefault[i] = random.nextInt(10);
        }

        System.out.println();
        System.out.println("Длина массива: " + arrayDefault.length);

        int moreThanEight = 0;
        int equalOne = 0;
        int evenNum = 0;
        int oddNum = 0;
        int arraySum = 0;

        for (int j : arrayDefault) {
            if (j > 8) moreThanEight++;
            if (j == 1) equalOne++;
            if (j % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }
            arraySum = arraySum + j;
        }

        System.out.println("Количество чисел больше 8: " + moreThanEight);
        System.out.println("Количество чисел равных 1: " + equalOne);
        System.out.println("Количество чётных чисел:   " + evenNum);
        System.out.println("Количество нечётных чисел: " + oddNum);
        System.out.println("Сумма всех чисел:          " + arraySum);
    }
}