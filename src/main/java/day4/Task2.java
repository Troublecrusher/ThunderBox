package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arrayDefault = new int[100];

        for (int i = 0; i < arrayDefault.length; i++) {
            arrayDefault[i] = random.nextInt(10000);
        }

        int maxFraction = Integer.MIN_VALUE;
        int minFraction = Integer.MAX_VALUE;
        int multipleTen = 0;
        int sumMultipleTen = 0;
        for (int fraction : arrayDefault) {
            if (fraction > maxFraction)
                maxFraction = fraction;
            if (fraction < minFraction)
                minFraction = fraction;
            if (fraction % 10 == 0)
                multipleTen++;
            sumMultipleTen = sumMultipleTen + fraction;
        }

        System.out.println("Наибольший элемент массива: " + maxFraction);
        System.out.println("Наименьший элемент массива: " + minFraction);
        System.out.println("Элементов массива, оканчивающихся на 0: " + multipleTen);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sumMultipleTen);
    }
}
