
package evidence;


public class BggestNumber {
    public static void main(String[] args) {
       getBigestNumber();
        
    }
    public static void getBigestNumber() {
        int a = 7;
        int b= 13;
        int c = 10;
        if (a> b && a > c ) {
            System.out.println(a + " Is biggest");
        }
       if (b > a && b > c ) {
            System.out.println(b + " Is biggest");
        }
        if (c > a && c > b ) {
            System.out.println(c + " Is biggest");
        }
        
    }
    
}
