package practiceforevidence;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Factorial is " + getFactorial());
    }

    public static BigInteger getFactorial() {
        BigInteger factorial = BigInteger.ONE;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

}
