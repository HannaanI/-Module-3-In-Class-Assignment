/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.inclass;

/**
 *
 * @author hannaan
 */
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         double sumDailyTotal = 0.0;
         
         System.out.print("Amount of cars: ");
         int carsParked = scanner.nextInt();
         
         for  ( int car = 1; car <= sumDailyTotal; car++){
             System.out.printf("Hours Parked:  ", car);
             
             int totalHoursParked = scanner.nextInt();
             double customerPaid = calculateCharge(totalHoursParked, 2.0, 0.50);
             System.out.printf("Total charge: ", car, customerPaid );
             sumDailyTotal += customerPaid;
             
             
         }
         
         System.out.printf("Yesterday's Total: ", sumDailyTotal);
    }
    
       public static double calculateCharge(int hours, double minfee, double add) {
       //I am not sure how to do the caluculations for this part. I do know this is where I will code on finding how much to charge the customer.
       }
}
 