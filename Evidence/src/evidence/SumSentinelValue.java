package evidence;

import java.util.Scanner;

public class SumSentinelValue {

    public static void main(String[] args) {
        System.out.println("Sum is " + getSum());

    }
   

    public static int getSum() {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        while (num != -1) {
            sum += num;
            num = input.nextInt();
        }
        return sum;
    }

}
