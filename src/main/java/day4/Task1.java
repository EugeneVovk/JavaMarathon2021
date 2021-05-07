package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Random rand = new Random();
        int[] arr = new int[n];
        int greaterThan8 = 0;
        int equalTo1 = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        int sumOfAll = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10);
            if (arr[i] > 8)
                greaterThan8++;
            if (arr[i] == 1)
                equalTo1++;
            if (arr[i] % 2 == 0)
                evenNumbers++;
            else
                oddNumbers++;
            sumOfAll += arr[i];
//            System.out.println(i + " - " + rand.nextInt(10) + " ");
//            System.out.print(arr[i] + " ");
        }
//        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println("Длина массива: " + n);
        System.out.println("Количество чисел больше 8: " + greaterThan8);
        System.out.println("Количество чисел равных 1: " + equalTo1);
        System.out.println("Количество четных чисел: " + evenNumbers);
        System.out.println("Количество нечетных чисел: " + oddNumbers);
        System.out.println("Сумма всех элементов массива: " + sumOfAll);
    }
}
