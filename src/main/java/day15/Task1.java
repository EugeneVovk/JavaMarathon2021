package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Вам дан файл с информацией об остатках обуви на складе (src/main/resources/shoes.csv).
 * Это пример реальной выгрузки остатков из 1С в csv файл (формат файла с разделителями,
 * в качестве разделителя использован символ “;”).
 * В этом файле содержится информация о названии модели обуви, ее размер и оставшееся на складе количество.
 * <p>
 * До преобразования в csv это была таблица с тремя колонками:
 * <p>
 * Название 						   Размер	   Кол-во
 * Ботинки HS РАН-Р 400 чер. ЗП			45		4
 * Ботинки PANDA САНИТАРИ 3916 S1 SRC бел.	37		1
 * ...
 * <p>
 * Необходимо сформировать новый файл (src/main/resources/missing_shoes.txt)
 * с информацией о моделях и размерах обуви, которой нет на складе (количество = 0).
 * Для этого реализуйте программу, которая принимает на вход csv файл
 * и создает новый txt файл следующего содержания (должно получиться 11 строк):
 * <p>
 * Ботинки СВАРЩИК ут М.1398 ЗП, 40, 0
 * Ботинки СВАРЩИК ут М.1398 ЗП, 45, 0
 * Ботинки ТОФФ БЕРКУТ И с выс.берцами ут ч, 38, 0
 * ...
 * <p>
 * Возникающие исключения обрабатывать (try-catch), а не пробрасывать в сигнатуре метода (throws).
 */

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        //  файл для считывания информации
        File file = new File("C:\\Users\\user\\IdeaProjects\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\shoes.csv");
        Scanner scanner = new Scanner(file);

        //  файл для записи информации
        File fileOut = new File("C:\\Users\\user\\IdeaProjects\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\result.txt");
        PrintWriter pw = new PrintWriter(fileOut);
        //  пробегаем по файлу и смотрим, что следующая строка есть
        //  и с текущей строкой производить какие-то действия
        while (scanner.hasNextLine()) {
            //  внутри цикла считываем каждую строку и разбиваем её на массив строк
            //  разбивать будем по ";" т.к в данном файле это разделитель
            String[] line = scanner.nextLine().split(";");
            //  теперь в массиве line мы имеем три эл-та
            //  производим фильтрацию и запись в конечный файл
            //  но мы не можем сравнивать строку с числом (line[2] == 0), потому что line[2] - это строка =>
            if (Integer.parseInt(line[2]) == 0) {
                //  значит нам данную строку надо записать в конечный файл - PrintWriter
                //  эта строка нах-ся в массиве под каждым эл-ом
                pw.println(line[0] + "; " + line[1] + "; " + line[2]);
            }
        }
        //  по выходу из цикла необходимо закрыть оба потока, сначала pw, а потом scanner
        pw.close();
        scanner.close();
    }
}