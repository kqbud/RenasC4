package day_22;



public class C1Object {
    public static void main(String[] args) {

        Song s1 = new Song();

        System.out.println(s1.getArtist());
        System.out.println(s1.getTitle());
        s1.setArtist("Slayer");
        s1.setTitle("Raining Blood");
        System.out.println(s1.getArtist());
        System.out.println(s1.getTitle());

        Song s2 = new Song();
        s2.setArtist("Metallica");
        s2.setTitle("Master of Puppets");
        System.out.println(s2.getArtist());
        System.out.println(s2.getTitle());




    }
}

class Song{
    /*
    instance data members and instance member functions are together called instance members.
     */
    String artist, title;//state of the object OR instance variable

    //behaviour of the object OR instance methods
    void setArtist(String artist){
        this.artist = artist;
    }

    String getArtist(){
        return this.artist;
    }

    void setTitle(String title){
        this.title = title;
    }

    String getTitle(){
        return this.title;
    }

}