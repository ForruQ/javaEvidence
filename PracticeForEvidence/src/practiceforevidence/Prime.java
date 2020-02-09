
package practiceforevidence;

import java.util.Scanner;


public class Prime {
    
    public static void main(String[] args) {
        getPrime();
    }
    
    public static void getPrime(){
        boolean isPrime  = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        for(int i = 2; i<= number/2; i++ ){
            if(number % i == 0) {
                isPrime = true;
                break;
            }
        }
        if(!isPrime){
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a prime Number");
        }
    }
}
