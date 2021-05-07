package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if (a < b) {
            int i = a;
            while(i < b) {
                if (i > a && i % 5 == 0 && i % 10 != 0)
                    System.out.print(i + " ");
                i++;
            }
        }
        else
            System.out.println("Некорректный ввод");
    }
}