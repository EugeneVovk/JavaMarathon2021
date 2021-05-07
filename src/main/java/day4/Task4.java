package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
//        int[] array = {1, 456, 1025, 65, 954, 5789, 4, 8742, 1040, 3254};

        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        System.out.println(Arrays.toString(array));

        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
        }
        System.out.println(maxSumIndex);
        System.out.println(maxSum);
    }
}
