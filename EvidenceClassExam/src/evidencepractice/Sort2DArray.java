package evidencepractice;

public class Sort2DArray {

    public static void main(String[] args) {
        int[][] arr = {
            {2, 6, 3, 9},
            {7, 3, 6, 1},
            {4, 7, 1, 8}
        };
        getSort(arr);
    }

    public static void getSort(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                for (int k = 0; k < m[i].length - j - 1; k++) {

                    if (m[i][k] > m[i][k + 1]) {
                        int t = m[i][k];
                        m[i][k] = m[i][k + 1];
                        m[i][k + 1] = t;
                    }
                }

            }

        }
        for (int[] oneD : m) {
            for (int num : oneD) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
