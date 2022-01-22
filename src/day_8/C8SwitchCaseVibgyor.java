package day_8;

public class C8SwitchCaseVibgyor {
    public static void main(String[] args) {
        char color='I';
        switch(color){
            case 'i': System.out.println("color is Indigo");
            case'I': System.out.println("color is Indigo");break;
            case'v':
            case'V':System.out.println("color is Violet");break;
            case'b':
            case'B':System.out.println("color is Blue");break;
            default:System.out.println("no color");
        }
    }
}
