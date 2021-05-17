package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year
 * (название музыкальной группы и год основания). Создать 10 или более экземпляров класса MusicBand ,
 * добавить их в список (выбирайте такие музыкальные группы, которые были созданы как до 2000 года,
 * так и после, жанр не важен). Перемешать список. Создать статический метод в классе Task3:
 * public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
 * Этот метод принимает список групп в качестве аргумента и возвращает новый список,
 * состоящий из групп, основанных после 2000 года. Вызвать метод groupsAfter2000(List<MusicBand> bands)
 * в методе main() на вашем списке из 10 групп.
 * Вывести в консоль оба списка (оригинальный и с группами, основанными после 2000 года).
 */

public class Task3 {
    public static void main(String[] args) {

        MusicBand musicBand1 = new MusicBand("Coldplay", 1996);
        MusicBand musicBand2 = new MusicBand("Nirvana", 1987);
        MusicBand musicBand3 = new MusicBand("The White Stripes", 1997);
        MusicBand musicBand4 = new MusicBand("Rage Against the Machine", 1991);
        MusicBand musicBand5 = new MusicBand("Guano Apes", 1994);
        MusicBand musicBand6 = new MusicBand("System Of A Down", 1992);
        MusicBand musicBand7 = new MusicBand(" The Prodigy", 1990);
        MusicBand musicBand8 = new MusicBand("Little Big", 2013);
        MusicBand musicBand9 = new MusicBand("Arctic Monkeys", 2002);
        MusicBand musicBand10 = new MusicBand("Audioslave", 2000);
        MusicBand musicBand11 = new MusicBand("Imagine Dragons", 2008);
        MusicBand musicBand12 = new MusicBand("alt-J", 2007);
        MusicBand musicBand13 = new MusicBand("Pendulum", 2002);

        List<MusicBand> bands = new ArrayList<>();
        bands.add(musicBand1);
        bands.add(musicBand2);
        bands.add(musicBand3);
        bands.add(musicBand4);
        bands.add(musicBand5);
        bands.add(musicBand6);
        bands.add(musicBand7);
        bands.add(musicBand8);
        bands.add(musicBand9);
        bands.add(musicBand10);
        bands.add(musicBand11);
        bands.add(musicBand12);
        bands.add(musicBand13);

        Collections.shuffle(bands);
        System.out.println(bands);

        System.out.println(groupsAfter2000(bands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {

        List<MusicBand> musicBandsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000)
                musicBandsAfter2000.add(band);
        }
        return musicBandsAfter2000;
    }
}
