package evidence;

public class Sort2DMatrix {

    public static int sort(int[][] m) {
        for(int i = 0; i < m.length; i++) {
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
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] m = {
            {2, 5, 3, 9},
            {9, 5, 8, 4}
        };
        sort(m);
    }
}
