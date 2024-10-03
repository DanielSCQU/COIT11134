/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package coit11134.fitnesstracker;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class TestFitnessTracker1 {
    
    public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String activity;
        int time;
        int year, month, day;
        System.out.print(" Enter Activity = ");
        activity = input.nextLine();
        System.out.print(" Enter time = ");
        time = input.nextInt();
        System.out.print(" Enter year = ");
        year = input.nextInt();
        System.out.print(" Enter month = ");
        month = input.nextInt();
        System.out.print(" Enter day = ");
        day = input.nextInt();
        LocalDate date = LocalDate.of(year,month,day);
        FitnessTracker1 fit1 = new FitnessTracker1 (activity,time,date );
        FitnessTracker1 fit2 = new FitnessTracker1 ();
        
        System.out.println("Activity Log= ");
        display (fit1);
        display (fit2);
}
public static void display(FitnessTracker1 f)
{
    System.out.println(f.getActivity() + "  " + f.getTime() + " minutes " + f.getDate());
}
}