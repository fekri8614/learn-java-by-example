package sokan_academy.sea4;

public class NestedIf {
    public static void main(String[] args) {
        int age = 30;

        if (age > 40) {
            System.out.println("You are older than 40.");
        } else {
            System.out.println("You are younger than 40.");

            if (age < 20) {
                System.out.println("You are under 20.");
            } else {
                System.out.println("You are over 20.");
            }
        }
    }
}
