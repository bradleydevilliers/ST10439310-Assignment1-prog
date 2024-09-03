/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a1question2;

/**
 *
 * @author lab_services_student
 */
public class reptile extends Animal {
    private String ScaleColor;
    private int Sheddingfrequency;

    public reptile(String Name, String Species, String trivQ, String correctAnswer , String ScaleColor,int Sheddingfrequency)
    {
         super(Name,Species,trivQ, correctAnswer );
              this.ScaleColor = ScaleColor;
              this.Sheddingfrequency = Sheddingfrequency;
    }
      public String getScaleColor()
    {
        return ScaleColor;
    }
    public int getSheddingfrequency()
    {
        
    return Sheddingfrequency;
    }
}
