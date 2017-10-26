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
public class MergeSortDemo {
    
   public static void main(String[] args) {  
       int[] a = ArrayUtil.randomIntArray(10000, 10000);
       
       MergeSorter.resetCounter();
       MergeSorter.sort(a);
       System.out.println("Array size: 10000; comparisons: " + MergeSorter.getCounter());
   }
    
}
