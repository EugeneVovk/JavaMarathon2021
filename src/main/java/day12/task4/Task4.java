package day12.task4;

import java.util.ArrayList;
import java.util.List;

/**
 * Скопировать MusicBand из прошлого задания и доработать таким образом,
 * чтобы в группу можно было добавлять и удалять участников.
 * Под участником понимается строка (String) с именем и фамилией.
 * Реализовать статический метод слияния групп (в классе MusicBand),
 * т.е. все участники группы А переходят в группу B. Название метода: transferMembers.
 * Этот метод принимает в качестве аргументов два экземпляра класса MusicBand.
 * В классе MusicBand, реализовать метод printMembers(), печатающий список участников в консоль
 * и метод getMembers(), возвращающий список участников.
 * Проверить состав групп после слияния.
 */

public class Task4 {
    public static void main(String[] args) {

        //  создаём список участников, для первой муз.группы
        List<String> members1 = new ArrayList<>();

        members1.add("Tom Morello");
        members1.add("Tim Commerford");
        members1.add("Brad Wilk");

        // создаём муз.группу и передаём список участников в конструктор
        MusicBand band1 = new MusicBand("Rage Against the Machine", 1991, members1);

        List<String> members2 = new ArrayList<>();

        members2.add("Christopher John Cornell");

        MusicBand band2 = new MusicBand("Audioslave", 2000, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
