package practiceforevidence;

import java.util.Scanner;

public class Facoriall {

    public static void main(String[] args) {
        getFactorial();
    }

    public static void getFactorial() {
        int factorial = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            factorial *= i;

        }
        System.out.println("Factorial is " + factorial);
    }
}
