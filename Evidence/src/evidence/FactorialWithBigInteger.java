package evidence;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialWithBigInteger {

    public static void main(String[] args) {

        System.out.println(getFactorial());
    }

    public static BigInteger getFactorial() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i)); // factorial*= i;
        }

        return factorial;
    }
}
