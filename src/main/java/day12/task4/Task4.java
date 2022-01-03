package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {

        List<String>members1 = new ArrayList<>();
        members1.add("Vince");
        members1.add("Mick");
        members1.add("Nicky");
        members1.add("Tommy");
        MusicBand band1 = new MusicBand("Motley Crue", 1992, members1);

        List<String>members2 = new ArrayList<>();
        members2.add("Freddie");
        members2.add("Roger");
        members2.add("Dicky");
        members2.add("Brian");
        MusicBand band2 = new MusicBand("Queen", 2001,members2);

        band1.transfer(band2);
        band1.printMembers();
        band2.printMembers();

    }
}
    class MusicBand {

        private String name;
        private int year;
        private List<String> members;

        public MusicBand(String name, int year, List<String> members) {
            this.name = name;
            this.year = year;
            this.members = members;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public List<String> getMembers() {
            return members;
        }

        public void setMembers(List<String> members) {
            this.members = members;
        }

        public void printMembers() {
            System.out.println(this.members);

        }

        @Override
        public String toString() {
            return "MusicBand{" +
                    "members=" + members +
                    '}';
        }

        public void transfer(MusicBand b) {
            for (String member : this.members) {
                b.getMembers().add(member);
            }
                this.getMembers().clear();

            }
        }




















