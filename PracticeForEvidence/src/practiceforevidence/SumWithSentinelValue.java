
package practiceforevidence;

import java.util.Scanner;

public class SumWithSentinelValue {
    public static void main(String[] args) {
        getSum();
    }
    
    public static void getSum() {
        Scanner  input = new Scanner(System.in);
        System.out.println("Enter numbers");
        int number = input.nextInt();
        int sum = 0;
        for (int i = 0; number != -1; i++) {
            sum += number;
            number = input.nextInt();
        }
        System.out.println("Sum is " + sum);
    }
}
