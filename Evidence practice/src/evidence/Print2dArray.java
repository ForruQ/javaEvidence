package evidence;

public class Print2dArray {

    public static void main(String[] args) {
        int[][] arr = {
            {2, 3, 6},
            {1, 7, 9}
        };
        print2dArray(arr);
    }

    public static void print2dArray(int[][] twoD) {
        int sum = 0;
        for (int[] oneD : twoD) {
            for (int num : oneD) {
                System.out.print(num + " ");
                sum += num;
            }
            System.out.println("Sum is " + sum);
        }
    }

}
