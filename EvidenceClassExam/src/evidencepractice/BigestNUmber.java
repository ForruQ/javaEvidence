
package evidencepractice;

import java.util.Scanner;


public class BigestNUmber {
    public static void main(String[] args) {
        getBiggest();
    }
    
    public static void getBiggest(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int a = input.nextInt();
        System.out.println("Enter 2nd number");
        int b = input.nextInt();
        System.out.println("Enter 3rd number");
        int c = input.nextInt();
        
        if (a > b && a > c) {
            System.out.println(a + " is the biggest Number");
        }
        if (b > a && b > c) {
            System.out.println(b + " is the biggest Number");
        } else {
            System.out.println(c + " is the biggest Number");
        }
    }
}
