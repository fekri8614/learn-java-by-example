package sokan_academy.sea5;

import java.util.Scanner;

public class MySwitchClass {
    public static void main(String[] args) {
        System.out.println("Please, choose which type of mail would you like?");

        Scanner typeSelection = new Scanner(System.in);

        char typeChosen = typeSelection.next().charAt(0);
        char toUppercase = Character.toUpperCase(typeChosen);

        switch (toUppercase) {
            case 'A':
                System.out.println("You will get your package via express mail and you have to pay to the postman.");
                break;
            case 'B':
                System.out.println("You will get your package via ordinary mail and you have to pay to the postman.");
                break;
            case 'C':
                System.out.println("You have to pay via Internet bank and download your software via Internet.");
                break;
            default:
                System.out.println("Sorry, It seems that there is a problem, please give it another try!");
        }

        typeSelection.close();
    }
}
