package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        int count = 0;
        int largestLine = 0;
        int maxIndexSum = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
                System.out.print(array[i][j] + "\t");
                count += array[i][j];
            }
            //System.out.println();
            System.out.println("\t" + "сумма эл-ов cтроки индекса [" + i + "]\tравна " + count);

            if (count >= largestLine) {
                largestLine = count;
                //largestLine = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array[i].length; j++)
                count += array[i][j];
            if (count == largestLine) {
                //largestLine = count;
                maxIndexSum = i;
                //System.out.println("\nИндекс строки, сумма чисел в которой максимальна: " + largestLine);
            }
        }
        System.out.println("\nИндекс строки, сумма чисел в которой максимальна: " + maxIndexSum);
    }
}