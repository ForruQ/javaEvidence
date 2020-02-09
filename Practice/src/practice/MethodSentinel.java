
package practice;

import java.util.Scanner;


public class MethodSentinel {
    public static void main(String[] args) {
        System.out.println("sum is "+ getSum());
    }
    
    public static int getSum(){
    int sum = 0;
    Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers");
        int number = input.nextInt();
        for (int i = 0; number != -1; i++) {
            sum += number;
            number = input.nextInt();
        }
        return sum;
}
    
}
