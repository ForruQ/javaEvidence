package practiceforevidence;

public class Sort2DArray {

    public static void main(String[] args) {
        int[][] arr = {
            {3, 9, 7, 5},
            {4, 8, 1, 6},
            {6, 3, 9, 7},
            {5, 1, 6, 3}
        };

        printArray(arr);
        System.out.println("");
        getSort(arr);
    }

    public static void getSort(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                for (int k = 0; k < m[i].length - j - 1; k++) {
                    if (m[i][k] > m[i][k + 1]) {
                        int swap = m[i][k];
                        m[i][k] = m[i][k + 1];
                        m[i][k + 1] = swap;
                    }
                }
            }

        }
        for (int[] oneD : m) {
            for (int num : oneD) {
                System.out.print(num + " ");
            }
            System.out.println("");
        }
    }

    public static void printArray(int[][] m) {
        for (int[] oneD : m) {
            for (int num : oneD) {
                System.out.print(num + " ");
            }
            System.out.println("");
        }
    }

}
