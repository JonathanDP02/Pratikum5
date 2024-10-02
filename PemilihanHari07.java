import java.util.Scanner;

public class PemilihanHari07 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi//

        String dayName, dayType;

        System.out.print("Input number 1 to 7: ");
        dayName = sc.nextLine();

        switch (dayName.toLowerCase()) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                dayType = "weekday";
                break;
            case "6":
            case "7":
                dayType = "weekend";
                break;
            default:
                dayType = "invalid day name";
    
        }

        //output//
        System.out.println(dayName + " is a " + dayType);
    }
}
