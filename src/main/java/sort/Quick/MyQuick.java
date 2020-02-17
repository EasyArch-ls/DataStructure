package sort.Quick;

import sort.Test;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-16
 */
public class MyQuick <T extends Comparable<T>>implements MyQuickInterface {
    protected Comparable[] array=null;
    @Override
    public void sort(Comparable[] array) {
        this.array=array;
        quick(0,this.array.length-1);
    }

    private void quick(int start,int end){
        if(start<end){
            int i,j;
            Comparable x;
            i=start;
            j=end;
            x= array[i];
            while (i<j){
                while (i<j && Test.cmp(array[j],x)>0){
                    j--;
                }
                if(i<j){
                    array[i++]=array[j];
                }
                while (i<j && Test.cmp(array[i],x)<0){
                    i++;
                }
                if(i<j){
                    array[j--]=array[i];
                }
                array[i]=x;
                quick(start,i-1);
                quick(i+1,end);
            }
        }
    }

}
