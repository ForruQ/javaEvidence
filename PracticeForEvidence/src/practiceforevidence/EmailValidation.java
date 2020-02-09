
package practiceforevidence;

import java.util.Scanner;


public class EmailValidation {
    public static void main(String[] args) {
        getEmail();
    }
    
    public static void getEmail() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an email");
        String email = input.nextLine();
        int atpos = email.indexOf("@");
        int dotpos = email.indexOf(".");
        if(atpos> 0 && dotpos <email.length()- 1 && atpos < dotpos -1) {
            System.out.println("Valid  Email");
        } else {
            System.out.println("Not valid");
        }
    }
   
    
}
