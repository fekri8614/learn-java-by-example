package sokan_academy.sea5;

import java.util.Scanner;

public class CItyCode {
    public static void main(String[] args) {

        System.out.print("Please, Enter your City name:");
        Scanner keyboardInput = new Scanner(System.in);

        String cityName = keyboardInput.next().toLowerCase();

        switch (cityName) {
            case "mashhad":
                System.out.println("Your city code is 051");
                break;
            case "arak":
                System.out.println("Your city code is 086");
                break;
            case "abadan":
                System.out.println("Your city code is 061");
                break;
            case "tehran":
                System.out.println("Your city code is 021");
                break;
            case "amol":
                System.out.println("Your city code is 011");
                break;
            case "chabahar":
                System.out.println("Your city code is 054");
                break;
            case "sanandaj":
                System.out.println("Sanandaj Code Is 087");
                break;
            default:
                System.out.println("Sorry, This City Is Not Defined!");
        }

        keyboardInput.close();
    }
}
