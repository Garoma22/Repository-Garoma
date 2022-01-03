package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> memberList1 = new ArrayList<>();
        memberList1.add(new MusicArtist("Hide", 1964));
        memberList1.add((new MusicArtist("Taiji", 1966)));

        MusicBand band1 = new MusicBand("X-Japan",1982, memberList1);

        List<MusicArtist> memberList2 = new ArrayList<>();
        memberList2.add(new MusicArtist("James Hatfield", 1962));
        memberList2.add(new MusicArtist("Kirk Hammet", 1964));

        MusicBand band2 = new MusicBand("Metallica", 1980, memberList2);

        MusicBand.transferMembers(band1,band2);  // слияние

        band1.printAllMembers();
        band2.printAllMembers();




    }
}
