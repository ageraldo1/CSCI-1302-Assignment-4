/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.assignments;

import java.util.Date;

/**
 *
 * @author Alexandre
 */
public class MergeSortDemo {
    
   public static void main(String[] args) {  
       
       Date start,end;
       
       System.out.println ("+---------------------------------------+");               
       System.out.println ("Example of MergeSortDemo class");
       System.out.println ("+---------------------------------------+");
       
       for ( int i = 10000; i < 90000; i = i + 10000 ) {
           int[] a = ArrayUtil.randomIntArray(i, i);
           
           MergeSorter.resetCounter();
           
           start = new Date();
               MergeSorter.sort(a);
           end = new Date();                
    
           System.out.println ("Array size.......: " + a.length);
           System.out.println ("Comparation......: " + MergeSorter.getCounter());
           System.out.println ("Time spent(ms)...: " + (end.getTime() - start.getTime()));
           System.out.println ("");
       }

   }
    
}
