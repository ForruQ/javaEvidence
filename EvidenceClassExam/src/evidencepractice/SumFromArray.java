
package evidencepractice;


public class SumFromArray {
    
    public static void main(String[] args) {
       
        int[] arr = {5, 8, 9, 4};
        getSum(arr);
        
    }
    
    
    public static void getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        System.out.println(sum);
    }
    
}
