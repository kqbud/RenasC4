package ArifZuhal;
import java.util.Arrays;
public class Ecig {
    public static void main(String[] args) {
        attributes e = new attributes();

        System.out.println(e.charger);
        System.out.println(Arrays.toString(e.controls));
        System.out.println(e.power);
        System.out.println(e.wattage);



        e.powerOn();
        System.out.println(e.power);
        e.wattageUp();
        System.out.println(e.wattage);
        e.wattageDown();
        System.out.println(e.wattage);
        e.powerOff();
        System.out.println(e.power);


    }
}

class attributes{
    String charger= "Micro USB";
    String[] controls= {"powerOn","powerOff","wattageUp","wattageDown"};
    static boolean power=false;
    static int wattage = 40;

    void powerOn(){
        power = true;
    }
    void powerOff(){
        power=false;
    }
    void wattageUp(){
        wattage++;
    }
    void wattageDown(){
        wattage--;
    }
    /* ALLAHIN BELASI STRING ARRAY LANETULLAHU ALEYHIM
     static String show(){
        String [] options = {"powerOn","powerOff","wattageUp","wattageDown"};
        return options;
    }*/
}
