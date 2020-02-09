
package evidence;

import java.util.Arrays;


public class ArrayAssending {
    public static void main(String[] args) {
        getArraydessending(2, 3, 4, 5, 9, 6);
    }
    
    public static void getArraydessending(int... arr) {
        Arrays.sort(arr);
        
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");  
        }
        System.out.println("");
        for(int j= arr.length -1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
    }
    
}
