
package evidence;

import java.util.Scanner;


public class PrintSum {
    
    public static  int SumUntill() {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        while( num != -1) {
        sum += num;
        num = input.nextInt();
    }
        return sum;
    }
}
