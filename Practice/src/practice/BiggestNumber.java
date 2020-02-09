
package practice;

import java.util.Scanner;


public class BiggestNumber {
    public static void main(String[] args) {
     getBig();
    }
    public static void getBig() {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers for a "); 
        int a = input.nextInt();
        System.out.println("Enter numbers for b "); 
       int b = input.nextInt();
       System.out.println("Enter numbers for c "); 
       int c = input.nextInt();
       
        if(a>b && a> c) {
            System.out.println("Biggest number " + a);
        }
        
        if(b>c && b> a) {
            System.out.println("Biggest number " + b);
        }
        
        if(c>a && c> b) {
            System.out.println("Biggest number " + c);
        }
        
    }
}
