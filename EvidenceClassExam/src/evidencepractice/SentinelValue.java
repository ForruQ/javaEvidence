
package evidencepractice;

import java.util.Scanner;


public class SentinelValue {
    public static void main(String[] args) {
        getSumSentinel();
    }
    
    public static void getSumSentinel() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 1; num != -1; i++) {
            sum += num;
            num = input.nextInt();
        }
        System.out.println("sum is " + sum);
    }
    
}
