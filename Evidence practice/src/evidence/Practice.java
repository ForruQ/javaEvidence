
package evidence;

import java.util.Scanner;

// Compute the interest According to 
public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a amount");
        double amount = input.nextDouble();
        System.out.println("Enter a rate");
        double rate = input.nextDouble();
        System.out.println("Enter a year");
        double year = input.nextDouble();
        double total = amount * Math.pow(1 + rate, year);
        System.out.println("Total amount " + total);
    }
    
}
