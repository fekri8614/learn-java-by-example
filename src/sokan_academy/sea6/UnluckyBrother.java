package sokan_academy.sea6;

import java.util.Random;

public class UnluckyBrother {
    public static void main(String[] args) {
        Random randomNumber = new Random(); // val random = Random()
        int hesamNumber;
        int hadiNumber;

        for (
                hesamNumber = randomNumber.nextInt(101), hadiNumber = randomNumber.nextInt(101);
                hesamNumber <= 1000 || hadiNumber <= 1000;
                hesamNumber += randomNumber.nextInt(11), hadiNumber += randomNumber.nextInt(11)
        ) {
            System.out.println("Hesam's number: " + hesamNumber + " Hadi's number: " + hadiNumber);
        }

        if (hesamNumber > hadiNumber) printMessage("Hesam won the game and Hadi has to buy it.");
        else if (hadiNumber > hesamNumber) printMessage("Hadi won the game and Hesam has to buy it.");
        else printMessage("Now they have to think about a third solution!");
    }

    private static void printMessage(String message) {
        System.out.println(message);
    }
}
