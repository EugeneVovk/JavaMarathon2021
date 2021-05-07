package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while(true) {
            // System.out.print("Введите город: ");
            String country = in.nextLine();
            // System.out.println(country + " - ваш ввод в консоль");
            if (country.equals("Stop")) {
                break;
            }
            else {
                switch (country) {
                    case "Москва":
                    case "Владивосток":
                    case "Ростов":
                        System.out.println("Россия");
                        break;
                    case "Рим":
                    case "Милан":
                    case "Турин":
                        System.out.println("Италия");
                        break;
                    case "Ливерпуль":
                    case "Манчестер":
                    case "Лондон":
                        System.out.println("Англия");
                        break;
                    case "Берлин":
                    case "Мюнхен":
                    case "Кёльн":
                        System.out.println("Германия");
                        break;
                    default:
                        System.out.println("Неизвестная страна");
                        break;
                }
                //System.out.println(" - ответ программы");
            }
        }
        //System.out.println("программа завершила работу");
    }
}
