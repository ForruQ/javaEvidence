package evidence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxValueUsingArray {

    static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int i = 0;
        while (num != -1) {
            numbers.add(num);
            num = input.nextInt();
        }
        System.out.println(BiggestNum(numbers));
    }

    public static int BiggestNum(List<Integer> nums) {
        Collections.sort(nums);
        return nums.get(nums.size() - 1);
    }

}
