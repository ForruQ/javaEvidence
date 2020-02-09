
package evidence;

import java.util.Scanner;


public class AverageUsingSentinelValue {
    public static void main(String[] args) {
          getAvg();
    }
    
    public static void getAvg() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers to get average");
        double num = input.nextDouble();
        double sum = 0;
        double avg;
        double count = 0;
        while(num != -1) {
            sum += num;
            count++;
            num = input.nextDouble();
        }
        avg = sum / count;
        System.out.println("Average is " + avg);
    }
    
}
