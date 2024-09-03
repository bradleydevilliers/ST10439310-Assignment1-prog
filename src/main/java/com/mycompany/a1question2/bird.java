/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a1question2;

/**
 *
 * @author lab_services_student
 */
public class bird extends Animal {
    private  String Feathercolor;
    private int wingSpan;

    public bird(String Name, String Species, String trivQ, String correctAnswer , String Feathercolor,int wingSpan )
    {
              super(Name,Species,trivQ,  correctAnswer);
              this.Feathercolor = Feathercolor;
              this.wingSpan = wingSpan;
        
    }
    public String getFeathercolor()
    {
        return Feathercolor;
    }
    public int getwingSpan()
    {
        
    return wingSpan;
    }
}
