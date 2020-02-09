
package practiceforevidence;

import java.util.Scanner;


public class EmailValid {
    public static void main(String[] args) {
        getEmailValid();
    }
    
    public static void getEmailValid() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Email");
        String email = input.nextLine();
        int atpos = email.indexOf("@");
        int dotpos= email.indexOf(".");
        if(atpos > 0 && dotpos < email.length() -1 && atpos <dotpos -1 ) {
            System.out.println("Email is valid");
        } else {
            System.out.println("not valid");
        }
}
}