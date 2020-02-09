
package evidencepractice;

import java.util.Scanner;


public class GradingSystem {
    public static void main(String[] args) {
        getGarade();
    }
    
    public static void getGarade() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        
        
        if(num>= 80) {
            System.out.println("A+");
        }
        if(num>= 70 && num <80) {
            System.out.println("A");
        }
        if(num>= 60 && num <70) {
            System.out.println("A-");
        }
        if(num>= 50 && num <60) {
            System.out.println("B");
        }
        if(num>= 40 && num <50) {
            System.out.println("C");
        }
        if(num>= 33 && num <40) {
            System.out.println("D");
        }
        if (num<33){
            System.out.println("Fail");
        }
    }
    
}
