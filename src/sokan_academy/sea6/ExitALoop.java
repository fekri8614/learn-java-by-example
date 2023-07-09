package sokan_academy.sea6;

public class ExitALoop {
    public static void main(String[] args) {
        int number = 0;
        while (number < 1000) {
            number += 100;

            if (number == 700) continue;
            System.out.println("Mu number is: " + number);
        }
    }
}
