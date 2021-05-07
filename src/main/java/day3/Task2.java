package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while(true) {
            //System.out.print("Введите два числа: ");
            double divisible = in.nextDouble();
            double divider = in.nextDouble();
            double result;

            //System.out.println((int)divisible + " " + (int)divider + " - ваш ввод в консоль");
            if (divider == 0)
                break;
            else {
                result = divisible / divider;
                //System.out.println(result + "  - ответ программы");
                System.out.println(result);
            }
        }
        //System.out.println("работа программы завершается");

    }
}
