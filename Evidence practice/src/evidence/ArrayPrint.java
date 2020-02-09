package evidence;

public class ArrayPrint {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {5, 6, 7},
            {7, 8, 9}
        };
        PrintArray(arr);
    }

    public static void PrintArray(int[][] twoD) {
        for (int[] oneD : twoD) {
            for (int num : oneD) {
                System.out.print(num + " ");

            }
            System.out.println("");
        }

    }
}
