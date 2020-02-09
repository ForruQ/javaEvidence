
package evidence;

import java.util.Scanner;


public class Prime {
    public static void main(String[] args) {
        getPrime();
    }
    public static void getPrime() {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean isPrime = false;
        for(int i = 2; i <= number/2; i++){
            if(number % i == 0) {
                isPrime = true;
                break;
                
            }
        }
        if(! isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("NOt prime");
        }
    }
}
