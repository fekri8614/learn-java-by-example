package sokan_academy.sea4;

public class ElseIf {
    public static void main(String[] args) {
        double intelligenceQuotient = 100;
        double termMean = 17.3;

        if (intelligenceQuotient > 100 || termMean > 18) {
            System.out.println("You have 30 percent discount.");

        } else if (intelligenceQuotient > 100 || termMean > 17) {
            System.out.println("You have 20 percent discount.");

        } else {
            System.out.println("You have no discount.");
        }

    }
}
