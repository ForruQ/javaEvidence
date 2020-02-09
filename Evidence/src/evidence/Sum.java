
package evidence;

import java.util.Scanner;


public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Enter a number");
            int sum = 0;
            int num = input.nextInt();
            for(int i = 1; i <= 10; i++) {
                
             sum += num;
             num = input.nextInt();
    }
        System.out.println("Sum " + sum);    
}
    
}
