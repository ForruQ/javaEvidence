
package practiceforevidence;

import java.util.Scanner;


public interface Interest {
        public static void main(String[] args) {
            getInterest();
        } 
    
    public static void getInterest(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount");
        double amount = input.nextDouble();
        System.out.println("Enter rate");
        double rate = input.nextDouble();
        System.out.println("Enter year");
        double year = input.nextDouble();
        
      double total = amount + Math.pow(1+ rate, year);
        System.out.println("Total is " + total);
    }
}
