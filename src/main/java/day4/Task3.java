package day4;

import java.util.Random;

/**
 * Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
 * Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
 * В консоль вывести индекс строки, сумма чисел в которой максимальна.
 * Если таких строк несколько, вывести индекс последней из них.
 */

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        int count;
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