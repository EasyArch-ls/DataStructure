package sort.xuanze;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-16
 */
public class Xuanze {
    public static int[] selectionSort(int[] array) {
        if (array.length == 0){
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a={2,5,1,8,7,9};
        Xuanze.selectionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
