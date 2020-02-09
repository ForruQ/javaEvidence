
package evidencepractice;

import java.util.Scanner;


public class PrimeNumberCheck {
    public static void main(String[] args) {
        getPrime();
    }
    
    
    public static void getPrime() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        boolean isPrime = false;
        for (int i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                isPrime= true;
                break;
            }
        }
        if(! isPrime){
            System.out.println("Prime number");
        } else {
            System.out.println("Not prime number");
        }
    }
}
