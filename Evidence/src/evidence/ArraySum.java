package evidence;

public class ArraySum {
// print an array and sum of the array
    public static void main(String[] args) {
        getArraySum(2, 3, 4, 5, 9);
    }

    public static void getArraySum(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            sum += arr[i];
         
        }
        System.out.println();
        System.out.println("Sum is " + sum);
    }
}
