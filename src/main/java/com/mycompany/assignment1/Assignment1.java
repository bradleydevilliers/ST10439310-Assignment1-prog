/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment1;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Assignment1 {

    public static void main(String[] args) 
    {   
        STudents ST = new STudents();
        int x=1;
        int n;
        Scanner input = new Scanner (System.in);
         System.out.println("Student Management Application");
         System.out.println("**************************************");
         System.out.println("Enter (1) to launch menu or any other key to exit");
          n = input.nextInt();
         if(x ==n)
         {
         ST.menu();
         }
           else
        {
            return;
        }
        
    }
   
}

