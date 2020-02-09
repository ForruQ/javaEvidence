
package evidencepractice;


public class Sort3DArray {
    
  public static void main(String[] args) {
        int[][][] arr = {
            {{3, 7, 4, 9},
                {8, 3, 7, 2} },
            
                {{8, 7, 2, 9},
                {1, 6, 9, 3} }
            };
        getSort(arr);
        }
    
    
    
    public static void getSort(int[][][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                for (int k = 0; k < m[i][j].length; k++) {
                    for (int l = 0; l < m[i][j].length - k - 1; l++) {
                        if(m[i][j][l] > m[i][j][l+ 1]){
                            int swap = m[i][j][l];
                            m[i][j][l]= m[i][j][l+ 1];
                            m[i][j][l+ 1]= swap;
                        }
                        
                    }
                    
                }
                
            }
            
        }
        for(int[][] twoD : m) {
            for(int[] oneD : twoD){
                for(int num : oneD){
                    System.out.print(num + " ");
                }
                System.out.println("");
            }
        }
    }
}
