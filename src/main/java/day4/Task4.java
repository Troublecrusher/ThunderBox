package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arrayDefault = new int[100];

        for (int i = 0; i < arrayDefault.length; i++) {
            arrayDefault[i] = random.nextInt(10000);
        }

        int maxSummary = 0;
        int maxSummaryIndex = 0;

        for (int i = 0; i < arrayDefault.length - 2; i++) {
            int summary = 0;
            for (int x = i; x < i + 3; x++) {
                summary += arrayDefault[x];
            }

            if (summary > maxSummary) {
                maxSummary = summary;
                maxSummaryIndex = i;
            }
        }

        System.out.println(maxSummaryIndex);
    }
}