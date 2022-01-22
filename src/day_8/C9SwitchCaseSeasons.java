package day_8;

public class C9SwitchCaseSeasons {
    public static void main(String[] args) {
        String season;
        int month =8;
        switch (month){
            case 12:
            case 1:
            case 2: System.out.println("Get a coat!");
            season = "Winter";
            break;
            case 3:
            case 4:
            case 5:System.out.println("Let's go for a walk!");
            season = "Spring";  break;
            case 6:
            case 7:
            case 8: season= "summer"; break;
            case 9:
            case 10:
            case 11: season="Autumn"; break;

            default:System.out.println("hayat bilgisi hocani sikiyim");


        }
        System.out.println("season");
    }
}
