/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a1question2;

/**
 *
 * @author lab_services_student
 */
public class mammal extends Animal
{
    private String Furcolor;
    private int gestationPeriod;
    private String correctAnswer;
   public mammal(String Name, String Species, String trivQ, String correctAnswer ,String Furcolor,int gestationPeriod) {
       super(Name,Species,trivQ,correctAnswer);
       this.Furcolor=Furcolor;
       this.gestationPeriod=gestationPeriod;
   }

   
   public String getFurcolor()
   {
       return Furcolor;
   }
   public int getgestationPeriod()
   {
       return gestationPeriod;
   }
}
