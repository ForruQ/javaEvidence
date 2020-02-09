
package evidence;

import java.util.Scanner;


public class Factor {
    public static void main(String[] args) {
        factorial();
    }
    public static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = input.nextInt();
        int factorial = 1;
        for (int i = 1; i<= number; i++) {
            factorial *= i;
        }
            System.out.println("Factorial is "+ factorial);
    }
    
}
