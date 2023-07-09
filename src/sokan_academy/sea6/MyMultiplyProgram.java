package sokan_academy.sea6;

public class MyMultiplyProgram {
    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        for (numberOne = 2, numberTwo = 1; numberTwo * numberOne <= 100; numberTwo++) {
            System.out.println("The result of " + numberOne + " * " + numberTwo + " is: " + (numberOne * numberTwo));
        }
    }
}
