
package practice;


public class Print2D {
    
    public static void main(String[] args) {
        int[][] arr = {
            {5, 7, 8, 3},
            {6, 2, 5, 3},
            {2, 8, 1, 0}
        };
        get2D(arr);
        
    }
    
    public static void get2D(int[][] twoD){
    for (int[] oneD : twoD) {
        for (int num : oneD) {
            System.out.print(num + " ");
        }
        System.out.println();
            
    }
   
}
    
}
