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

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;


public class CitySortDemo {
    
    public static void main (String args[]) {
        ArrayList<City> cities = new ArrayList<City>();
         
        cities.add(new City("Cumming"));
        cities.add(new City("Phoenix"));
        cities.add(new City("Juneau"));
        cities.add(new City("Sao Paulo"));        
        cities.add(new City("New York"));
        cities.add(new City("Alpharetta"));
        cities.add(new City("Clarkston"));
         
        System.out.println ("+---------------------------------------+");               
        System.out.println ("Example of CitySortDemo class");
        System.out.println ("+---------------------------------------+");
        
        System.out.println ("Array size.......: " + cities.size());
        System.out.println ("Original array...: " + cities);

        Collections.sort(cities);
        
        System.out.println ("Sorted array.....: " + cities);
    }
    
}
