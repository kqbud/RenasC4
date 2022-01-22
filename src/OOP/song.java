package OOP;

class song{
    /*
    instance data members and instance member functions are together called instance members.
     */
    String artist, title;//state of the object OR instance variable

    //behaviour of the object OR instance methods
    void setArtist(String artist){  this.artist = artist;   }

    String getArtist(){ return this.artist; }

    void setTitle(String title){    this.title = title; }

    String getTitle(){  return this.title;    }

}