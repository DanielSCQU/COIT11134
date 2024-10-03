/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package coit11134.fitnesstracker;

import java.time.LocalDate;

/**
 *
 * @author Daniel
 */
public class FitnessTracker1 {
    private String activity;
    private int time;
    LocalDate date; 

public FitnessTracker1() {
    this.activity = "running" ;
    this.time = 0 ;
    this.date = LocalDate.of(2024, 1, 1);          
    }
public FitnessTracker1(String a, int m, LocalDate d){
    activity = a;
    time = m;
    date = d ;       
}
public String getActivity()
    {
    return activity;    
    }
public int getTime()
    {
    return time;    
    }
public LocalDate getDate()
    {
    return date;    
    }

}
