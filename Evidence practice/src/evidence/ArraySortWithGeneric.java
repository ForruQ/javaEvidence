package evidence;

public class ArraySortWithGeneric {
    public static void main(String[] args) {
        
    }

    public static <E extends Comparable<E>> void sort(E[] list) {
        E currentMIn;
        int currentMinIndex;
        for (int i = 0; i < list.length - 1; i++) {
            currentMIn = list[i];
            currentMinIndex = i;

            for (int j = i + 1; i < list.length; j++) {
                if (currentMIn.compareTo(list[j]) > 0) {
                    currentMIn = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMIn;
            }
        }

    }

    public static void printList(Object[][] twoD) {
        for (Object[] oneD : twoD) {
            for (Object num : oneD) {
                System.out.print(num + " ");

            }
            System.out.println();
        }
    }
}
