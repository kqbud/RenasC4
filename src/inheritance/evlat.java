package inheritance;

public class evlat {
    public static void main(String[] args) {
        Baba b1 = new Baba("Blue");
        System.out.println(b1.toString());
    }
}

class Dede{
    protected String eyesColur = "Blue";

    public Dede(String eyesColur){
        this.eyesColur=eyesColur;
    }
/*
    public String getEyesColur(){
        return eyesColur;
    }
*/
    @Override
    public String toString() {
        return "Dede{" +
                "eyesColur='" + eyesColur + '\'' +
                '}';
    }
}

class Baba extends Dede{
    public Baba(String eyesColur) {
        super(eyesColur);
    }
}