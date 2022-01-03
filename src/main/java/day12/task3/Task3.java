
package day12.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Amatori", 2002);
        MusicBand band2 = new MusicBand("БИ-2", 1998);
        MusicBand band3 = new MusicBand("AnacondaZ", 1999);
        MusicBand band4 = new MusicBand("Гречка", 2013);
        MusicBand band5 = new MusicBand("Пруд", 2020);
        MusicBand band6 = new MusicBand("Пасош", 2011);
        MusicBand band7 = new MusicBand("Noize", 2012);
        MusicBand band8 = new MusicBand("Coin", 2014);
        MusicBand band9 = new MusicBand("Sabaton", 2011);
        MusicBand band10 = new MusicBand("Children of Bodom", 1993);

        List<MusicBand> musicBands = new ArrayList<>();

        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);

        Collections.shuffle(musicBands);
        System.out.println(musicBands);


        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for (MusicBand band : musicBands)
            if (band.getYear() > 2000) {
                bandsAfter2000.add(band);
            }
        musicBands.clear();

        System.out.println(musicBands);
        System.out.println(bandsAfter2000);

    }
}

