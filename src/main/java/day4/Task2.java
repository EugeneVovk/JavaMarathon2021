package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] array = new int[100];
        Random rand = new Random();
        int largestElement = 0;
        int smallest = 10000;
        int numberOfEndingZeroElements = 0;
        int sumOfEnding0Elements = 0;

        for (int arr : array) {
            arr = rand.nextInt(10000);
            System.out.print(arr + " ");
            if (arr > largestElement)
                largestElement = arr;
            if (arr < smallest)
                smallest = arr;
            if (arr % 10 == 0) {
                numberOfEndingZeroElements++;
                sumOfEnding0Elements += arr;
            }
        }
        System.out.println();
        System.out.println("наибольший элемент массива: " + largestElement);
        System.out.println("наименьший элемент массива: " + smallest);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + numberOfEndingZeroElements);
        System.out.println("сумма элементов массива, оканчивающихся на 0: " + sumOfEnding0Elements);
    }
}