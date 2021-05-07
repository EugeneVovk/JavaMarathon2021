package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int i = 0;
        while (i < 5) {
            //System.out.print("Введите два числа: ");
            double divisible = in.nextDouble();
            double divider = in.nextDouble();
            double result;
            //System.out.println((int)divisible + " " + (int)divider + " - ваш ввод в консоль");
            if (divider == 0)
                System.out.println("Деление на 0");
            else {
                result = divisible / divider;
                //System.out.println(result + " - ответ программы");
                System.out.println(result);
            }
            i++;
        }
        //System.out.println("работа программы завершается");
    }
}
