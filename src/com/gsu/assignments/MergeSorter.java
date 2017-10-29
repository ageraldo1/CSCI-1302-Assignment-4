/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.assignments;

/**
 *
 * @author Alexandre
 */
public class MergeSorter {
   
    private static int nr_count;
    
    private static void merge(int[] first, int[] second, int[] a)
       {  
          int iFirst = 0; // Next element to consider in the first array
          int iSecond = 0; // Next element to consider in the second array
          int j = 0; // Next open position in a

          // As long as neither iFirst nor iSecond is past the end, move
          // the smaller element into a
          while (iFirst < first.length && iSecond < second.length)
          {  
             if (first[iFirst] < second[iSecond])
             {  
                a[j] = first[iFirst];
                iFirst++;
                nr_count++;
             }
             else
             {  
                a[j] = second[iSecond];
                iSecond++;
                nr_count++;
             }
             j++;
          }

          // Note that only one of the two loops below copies entries
          // Copy any remaining entries of the first array
          while (iFirst < first.length) 
          { 
             a[j] = first[iFirst]; 
             iFirst++; j++;
          }
          // Copy any remaining entries of the second half
          while (iSecond < second.length) 
          { 
             a[j] = second[iSecond]; 
             iSecond++; j++;
          }
       }
    
    public static void sort(int[] a) {
        if ( a.length == 1) {
            return;
        }
        
        int[] first = new int[a.length /2];
        int[] second = new int[a.length - first.length];
        
        for (int i = 0; i < first.length; i++) {
            first[i] = a[i];
        }
        
        for (int i = 0; i < second.length; i++) {
            second[i] = a[first.length + i];
        }
        
        sort(first);
        sort(second);
        merge(first,second,a);
    }
    
    public static int getCounter() {
        return nr_count;
    }
    
    public static void resetCounter() {
        nr_count = 0;
    }
    
}
