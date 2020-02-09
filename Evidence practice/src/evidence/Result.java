
package evidence;

import java.util.Scanner;


public class Result {
    public static void main(String[] args) {
        getresult();
    }
    public static void getresult() {
    Scanner input = new Scanner(System.in);
        int external = input.nextInt();
        int evidence = input.nextInt();
        
      
        
        if (external  >= 60 && evidence >= 30 ) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
}
}

