package evidence;

public class ArrayAssending {

    public static void main(String[] args) {
        getArrayAssending(3, 8, 9, 3, 6);
        System.out.println(" ");
        getArraydessending(3, 8, 9, 3, 6);
    }

    public static void getArrayAssending(int... arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void getArraydessending(int... arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

}
