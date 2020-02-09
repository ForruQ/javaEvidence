
package evidence;

import java.util.Scanner;


public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = input.nextInt();
        
        boolean isPrime = false;
        for(int i = 2; i<num/2; i++) {
            if(num % i == 0) {
              isPrime= true;
              break;
            }
        }
        if(isPrime) {
            System.out.println("Not a prime number");
        }
        else {
            System.out.println("prime number");
        }
    }
    
}
