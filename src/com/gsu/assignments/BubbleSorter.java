/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.assignments;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Alexandre
 */
public class BubbleSorter {    
    private static void sort(int[] a) {
        boolean s = true;
      
        for (int i = a.length - 1; i > 0 && s; i--) {
            s = false;
         
            for (int y = a.length - 1; y >= a.length - i; y--) {
                if (a[y] < a[y - 1]) {
                    swap(y, y - 1, a);
                    s = true;
                }
            }
        }
    }
    
    private static void swap(int i, int j, int[] a) {
        int t = a[i];
      
        a[i] = a[j];
        a[j] = t;
    }
    
    
    public static void main(String[] args) {
       Date start,end;
       int[] a;
       
       System.out.println ("+---------------------------------------+");               
       System.out.println ("Example of BubbleSorter class");
       System.out.println ("+---------------------------------------+");
       
       
       for ( int i = 10; i < 50; i = i + 10 ) {
           a = ArrayUtil.randomIntArray(i, i);
           
           System.out.println ("Array size.......: " + a.length);
           System.out.println ("Original array...: " + Arrays.toString(a));
           
           start = new Date();
               BubbleSorter.sort(a);
           end = new Date();                
           
           System.out.println ("Sorted array.....: " + Arrays.toString(a));
           System.out.println ("Time spent(ms)...: " + (end.getTime() - start.getTime()));
           System.out.println ("");
       }
    }
}    
    
