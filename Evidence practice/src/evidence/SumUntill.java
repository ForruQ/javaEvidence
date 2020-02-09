package evidence;

import java.util.Scanner;

public class SumUntill {

    public static void main(String[] args) {
        System.out.println("sum is " + getSum());

    }

    public static int getSum() {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = input.nextInt();
        while (num != -1) {
            sum += num;
            num = input.nextInt();
        }
        return sum;
    }

}
