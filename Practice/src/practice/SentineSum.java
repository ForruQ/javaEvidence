
package practice;

import java.util.Scanner;


public class SentineSum {
    public static void main(String[] args) {
       int sum = 0;
       Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers");
       int number = input.nextInt();
       
        for (int i = 0; number != -1 ; i++) {
            sum += number;
            number = input.nextInt();
            
        }
        System.out.println("sum " + sum);
}

}