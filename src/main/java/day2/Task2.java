package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if (a < b) {
            for(int i = a; i < b; i++) {
                if (i > a && i % 5 == 0 && i % 10 != 0)
                    System.out.print(i + " ");
            }
        }
        else
            System.out.println("Некорректный ввод");
    }
}
