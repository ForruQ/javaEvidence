package practiceforevidence;

import java.util.Scanner;

public class SumWithSentinel {
    public static void main(String[] args) {
        getSum();
    }
    public static void getSum() {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 0; i != -1; i++) {
            sum += number;
            number = input.nextInt();
        }
        System.out.println("Sum is " + sum);
    }

}
