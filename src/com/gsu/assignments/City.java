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
public class City implements Comparable<City>{
    private String name;

    public City(String name) {
        this.name = name;
    }
   
    public String getName() {
        return name;
    }
    

    @Override
    public int compareTo(City other) {
        return name.compareTo(other.name);        
    }
    
    @Override
    public String toString() {
        return this.name;
    }

}
