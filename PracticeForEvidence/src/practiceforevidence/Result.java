
package practiceforevidence;

import java.util.Scanner;


public class Result {
    public static void main(String[] args) {
        getResult();
    }
    
    public  static void getResult() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number for External ");
        int external = input.nextInt();
        System.out.println("Enter number for Evidence");
        int evidence = input.nextInt();
        if(external >= 60 && evidence >= 30) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
    
}
