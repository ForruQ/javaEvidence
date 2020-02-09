package evidence;

import java.util.Scanner;

public class GraddingSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a marks");
        double marks = input.nextDouble();
        System.out.println(getGrade(marks));;
    }

    public static String getGrade(double mark) {
        String obtainMark = "F";
        if (mark > 100 || mark < 0) {
            obtainMark = "invalid mark";
        } else {
            if (mark >= 80) {
                obtainMark = "A+";
            } else if (mark >= 70) {
                obtainMark = "A";
            } else if (mark >= 60) {
                obtainMark = "A-";
            } else if (mark >= 50) {
                obtainMark = "B";
            } else if (mark >= 40) {
                obtainMark = "C";
            } else if (mark >= 33) {
                obtainMark = "D";
            } else {
                obtainMark = "F";
            }
        }
        return obtainMark;
    }

}
