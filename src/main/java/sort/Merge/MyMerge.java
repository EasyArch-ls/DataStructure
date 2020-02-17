package sort.Merge;

import sort.Test;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-16
 */
public class MyMerge <T extends Comparable<T>> implements MyMergeInterface {

      @Override
      public void sort(Comparable[] array) {
        Mysort(array,0,array.length);
        return ;
       }

      private  void  Mysort(Comparable[] array,int begin,int end){
          if((end-begin)<2){
            return;
          }
          int mid=((end-begin)>>1)+begin;
          Mysort(array,begin,mid);
          Mysort(array,mid,end);
          Merge(array,begin,mid,end);
          return ;
      }

      private void Merge(Comparable[] array,int begin,int mid,int end){
          int li=0,le=mid-begin;
          int ri=mid,re=end;
          int ai=begin;
          Comparable[] leftarray=  new Comparable[array.length>>1];
          for (int i = 0; i <le ; i++) {
              leftarray[i]=array[begin+i];
          }
          while (li<le) {
              if (ri<re && Test.cmp(array[ri],leftarray[li])<0) {
                  array[ai++]=array[ri++];
              }else {
                  array[ai++]=leftarray[li++];
              }
          }
      }

}
