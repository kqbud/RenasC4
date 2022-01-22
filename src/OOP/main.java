package OOP;

import OOP.song;

public class main {
    public static void main(String[] args) {

        song s1 = new song();

        System.out.println(s1.getArtist());
        System.out.println(s1.getTitle());
        s1.setArtist("Slayer");
        s1.setTitle("Raining Blood");
        System.out.println(s1.getArtist());
        System.out.println(s1.getTitle());


    }
}
