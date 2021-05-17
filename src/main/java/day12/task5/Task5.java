package day12.task5;

import java.util.ArrayList;
import java.util.List;

/**
 * Скопировать MusicBand из прошлого задания и доработать -
 * теперь у участника музыкальной группы есть не только имя,
 * но и возраст. Соответственно, теперь под участником понимается не строка,
 * а объект класса MusicArtist. Необходимо реализовать класс MusicArtist
 * и доработать класс MusicBand (создать копию класса) таким образом,
 * чтобы участники были - объекты класса MusicArtist.
 * После этого, надо сделать то же самое, что и требовалось в 4 задании -
 * слить две группы и проверить состав групп после слияния.
 * Методы для слияния и для вывода участников в консоль необходимо тоже переработать,
 * чтобы они работали с объектами класса MusicArtist.
 */

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();

        members1.add(new MusicArtist("Tom Morello", 56));
        members1.add(new MusicArtist("Tim Commerford", 53));
        members1.add(new MusicArtist("Brad Wilk", 52));

        MusicBand band_1 = new MusicBand("Rage Against the Machine", 1991, members1);

        List<MusicArtist> members2 = new ArrayList<>();

        members2.add(new MusicArtist("Christopher John Cornell", 52));

        MusicBand band_2 = new MusicBand("Audioslave", 2000, members2);

        band_1.printMembers();
        band_2.printMembers();

        MusicBand.transferMembers(band_1, band_2);

        band_1.printMembers();
        band_2.printMembers();
    }
}
