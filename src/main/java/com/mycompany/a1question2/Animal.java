/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package com.mycompany.a1question2;

/**
 *
 * @author lab_services_student
 */
public class Animal 
{
    String Name;
    String Species;
    String triviaQ;
    String correctAnswer;
    
    public Animal(String Name,String Species,String trivQ,String correctAnswer){
        
        
        this.Name= Name;
        this.Species= Species;
        this.triviaQ = trivQ;
        this.correctAnswer = correctAnswer;
    }
    public String getName()
    {
        return Name;
    }
    public String getSpecies()
    {
        return Species;
    }
    public String gettriviaQ()
    {
        return triviaQ;
    }
     public String getcorrectAnswer()
    {
        return correctAnswer;
    }
}
