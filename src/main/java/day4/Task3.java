package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();

        int m = 12;
        int n = 8;

        int[][] array2Dim = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int x = 0; x < n; x++) {
                array2Dim[i][x] = random.nextInt(50);
            }
        }

        int maxSumString = 0;
        int maxStringIndex = 0;

        for (int i = 0; i < m; i++) {
            int summary = 0;
            for (int x = 0; x < n; x++) {
                summary += array2Dim[i][x];
            }

            if (summary >= maxSumString) {
                maxSumString = summary;
                maxStringIndex = i;
            }
        }

        System.out.println(maxStringIndex);
    }
}