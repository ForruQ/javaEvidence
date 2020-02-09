
package practice;

import java.util.Scanner;

public class BigAndLow {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        System.out.println("Enter 3 numbers");
       int a = input.nextInt();
        int max = a;
        while(a != 5) {
            while(max < a) {
                max = a;
            }
            a = input.nextInt();
        }
        System.out.println("highest number is " + max);
        int min = a;
        while(a != 5) {
            while(min > a) {
                min = a;
            }
            a = input.nextInt();
        }
        System.out.println("Lowest number is " + min);
    }
}
