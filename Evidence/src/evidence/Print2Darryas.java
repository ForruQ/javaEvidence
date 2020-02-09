package evidence;

public class Print2Darryas {

    public static void main(String[] args) {
        int[][] arr = {
            {2, 4, 7, 9},
            {2, 4, 6, 9}
        };
        getArray(arr);

    }

    public static void getArray(int[][] bangla) {
        int sum = 0;
        for (int[] oneD : bangla) {
            for (int num : oneD) {
                System.out.print(num + " ");
                sum += num;
            }
            
        }
        System.out.println("");
        System.out.println("sum is " + sum);
    }

}
