package evidencepractice;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        getCheck();
    }

    public static void getCheck() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word for check");
        String str = input.nextLine();
        String rvs = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rvs += str.charAt(i);

        }
        if (str.equals(rvs)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

}
