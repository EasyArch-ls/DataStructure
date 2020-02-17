package sort.insert;

import sort.Test;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-16
 */
public class MyInsert implements MyInsertInterface {
    protected Comparable[] array=null;
    @Override
    public void sort(Comparable[] array) {
        this.array=array;
        insert(0,array.length);
    }
    private void insert(int start,int end){
        int i=1,j=0,k=0;
             for ( ; i < end; i++) {
                     for (j = i - 1; j >= 0; j--) {
                         if (Test.cmp(array[i], array[j]) > 0) {
                             break;
                         }
                     }
                     if (j != i - 1) {
                         Comparable temp = array[i];
                         for (k = i - 1; k > j ; k--) {
                             array[k + 1] = array[k];
                         }
                         array[k + 1] = temp;
                     }
            }
        }
    public static int[] insertionSort(int[] array) {
        if (array.length == 0){
            return array;
        }
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
        return array;

    }
    }

