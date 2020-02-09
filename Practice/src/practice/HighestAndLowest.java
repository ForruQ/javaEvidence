
package practice;

import java.util.Scanner;


public class HighestAndLowest {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        getHighest(a, b, c);
        getLowest(a, b, c);
        
    }
    public static void getHighest(int a, int b, int c) {
        if(a> b && a > c) {
            System.out.println("Highest number is " + a);
        }
        if(b> a && b > c) {
            System.out.println("Highest number is " + b);
        }
        if(c> a && c > b) {
            System.out.println("Highest number is " + c);
        }
    }
     public static void getLowest(int a, int b, int c) {
        if(a< b && a < c) {
            System.out.println("Lowest number is " + a);
        }
        if(b< a && b < c) {
            System.out.println("Lowest number is " + b);
        }
        if(c< a && c < b) {
            System.out.println("Lowest number is " + c);
        }
    }
}
