
package practice;

import java.util.Scanner;


public class SsumUpTo {
    public static void main(String[] args) {
        getSumUpTo() ;
        System.out.println(getSum()); 
        
        
    }
    
    
    public static void getSumUpTo() {
    int sum = 0;
    Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers ");
    int number = input.nextInt();
    
        for (int i = 1; i <= 10; i++) {
            sum += number;
         number = input.nextInt();
         
            
        }
        System.out.println("sum " +sum);
        
}
    public static int getSum() {
        int sum =0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            
            
        }
        return sum;
    }
}


