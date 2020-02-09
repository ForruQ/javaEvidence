package evidencepractice;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        getPalindrom();
    }

    public static void getPalindrom() {
        String str, reverse = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        str = input.nextLine();

       int length = str.length();

        for (int i = length -1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if (str.equals(reverse)) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }

}
