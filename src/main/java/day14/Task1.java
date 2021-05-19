package day14;

/**
 * Создать .txt файл в папке проекта, как показано в видео (урок 36, время 15:30).
 * Заполнить его вручную десятью произвольными числами.
 * Реализовать статический метод printSumDigits(File file),
 * который считает сумму всех чисел в этом файле и выводит ее на экран.
 * Если файла не существует в папке проекта, в программе необходимо выбрасывать исключение
 * и выводить в консоль сообщение “Файл не найден”. Помимо этого,
 * если чисел в файле меньше или больше 10, необходимо выбрасывать исключение
 * и выводить в консоль сообщение “Некорректный входной файл”.
 * Вызвать данный метод в методе main().
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("text");

        printSumDigits(file);

    }

    public static void printSumDigits(File file) {

        try {
            Scanner scanner = new Scanner(file);
            //  если файл найден, значит мы идём дальше и считываем следующую строку, записывая её в переменную
            String line = scanner.nextLine();
            //  делим строку по пробелам и кладём её в массив
            String[] numbers = line.split(" ");
            //  проверяем, сколько чисел в файле
            if (numbers.length != 10) {
                //  выбрасываем исключение
                throw new IllegalArgumentException();
            }
            //  если всё верно идём дальше и считаем сумму всех чисел в файле
            int sum = 0;
            //  переводим строки в цифры
            for (String number : numbers)
                sum += Integer.parseInt(number);
            System.out.println(sum);
            //  Ловим все выброшенные исключения
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}