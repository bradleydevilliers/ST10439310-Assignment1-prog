/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class STudents 
{
 private ArrayList<String>report;
 
 
   private int StID1 =10111;
   private int StID2 =10112;
   private int StID3 =10113;
    
    public  STudents(){
         report= new ArrayList<>();
        String Name1=("J.Bloggs");
        String Age1=("19");
        String Email1= ("jbloggs@ymail.com");
        String Course1=("disd");
        int  ID1=10111;
        
        String Name2=("J.Doe");
        String Age2 =("21");
        String Email2= ("jdoe@ymail.com");
        String Course2=("disd");
        int  ID2=10112;
        
        String Name3=("P.Parker");
        String Age3 =("20");
        String Email3= ("spidey@gmail.com");
        String Course3=("disn");
        int  ID3=10113;
        
        report.add("\nStudent1\n"
             + "------------------------\n"
             + "Student ID: "+ID1+"\n"
             + "Student Name:"+ Name1+"\n"
             + "Student Age:"+ Age1+"\n"
             + "Student Email:"+Email1+"\n"
             + "Student Course:"+Course1+"\n"
             + "-------------------------\n");
        
     report.add("\nStudent2\n"
             + "------------------------\n"
             + "Student ID: "+ID2+"\n"
             + "Student Name:"+ Name2+"\n"
             + "Student Age:"+ Age2+"\n"
             + "Student Email:"+Email2+"\n"
             + "Student Course:"+Course2+"\n"
             + "-------------------------\n");
     
     report.add("\nStudent3\n"
             + "------------------------\n"
             + "Student ID: "+ID3+"\n"
             + "Student Name:"+ Name3+"\n"
             + "Student Age:"+ Age3+"\n"
             + "Student Email:"+Email3+"\n"
             + "Student Course:"+Course3+"\n"
             + "-------------------------\n");
      

    }
    
    public void SaveStudent()
    {
        int x=1;
        int n;
        String name4;
        String ID4;
        int Age4;
        String Email4;
        String Course4;      
        Scanner put = new Scanner (System.in);
        System.out.println("Enter the Student Name" );
        name4 =put.nextLine();
        System.out.println("Enter the Student ID" );
        ID4 =put.nextLine();    
        System.out.println("Enter the Student Email" );
        Email4 =put.nextLine();
        System.out.println("Enter the Student Course" );
        Course4 =put.nextLine();
          System.out.println("Enter the Student Age" );
        Age4 =put.nextInt();
       while(Age4<16)
        {
            System.out.println("You HAVE ENTERED THE INCORRECT AGE!!"+
                    "Please re-enter the students Age");
             Age4 =put.nextInt();   
        }
        System.out.println("CAPTURE NEW STUDENT" );
        System.out.println("*******************************" );
        System.out.println("Enter the Student ID:" + ID4);
        System.out.println("Enter the Student Name:"+ name4 );     
        System.out.println("Enter the Student Age:" + Age4 );
        System.out.println("Enter the Student Email:"+ Email4 );
        System.out.println("Enter the Student Course:"+Course4 );
        System.out.println("NEW STudent saved successfully");
        report.add("\nStudent4\n"
             + "------------------------\n"
             + "Student ID: "+ID4+"\n"
             + "Student Name:"+ name4+"\n"
             + "Student Age:"+ Age4+"\n"
             + "Student Email:"+Email4+"\n"
             + "Student Course:"+Course4+"\n"
             + "-------------------------\n");
        System.out.println("Enter(1) to launch the menu or any other key to exit" );
         n = put.nextInt();
        if(x ==n)
         {
        menu();
         }
         
    }
    public   void SearchStudent( )
    {
        int s=1;
        int n;
        int x;
        Scanner put = new Scanner (System.in);
       System.out.println("Enter the student ID to Search:"  );  x=put.nextInt();
       
       if(x==10111)
       {
           System.out.println(report.get(1));
       }
        else if(x==10112)
        {
            System.out.println(report.get(2));
        }
       else if(x==10113)
        {
            System.out.println(report.get(3));
        }
       else
       {
           System.out.println("Student with Student ID " + x + "Was not found ");
           System.out.println("Enter(1) to launch the menu or any other key to exit" );
            n = put.nextInt();
           
         if(s ==n)
         {
         menu();
         }
       }
       
       
    }
     public  void StudentReport()
    {
         Scanner put = new Scanner (System.in);
        int x=1;
        int n;
      System.out.println(report); 
       System.out.println("Enter(1) to launch the menu or any other key to exit" );
        n = put.nextInt();
       if(x ==n)
         {
         menu();
         }
     
    }
      public void DeleteStudent()
    {
       Scanner put = new Scanner (System.in);
        int b;
        String D;
        String C ="Y";
        int x=1;
        int n;
       System.out.println("Enter The student ID to Delete :");
        b = put.nextInt();
        System.out.println("ARE you sure you want to DELETE student  :"+""+ b+""+ "from the sytem? YES  enter (Y) to delete");
         D= put.nextLine();
           System.out.println("--------------------------------------------------------------------------------------------------");
           if(D.equalsIgnoreCase(C)&&b==this.StID1)
                  
           {
               report.remove(1);
              System.out.println("Student with Student ID "+ b+"WAs Deleted"); 
              System.out.println("--------------------------------------------------------------------------------------------------");
              
                  
              
             }
              
           else
           {
                System.out.println("Enter(1) to launch the menu or any other key to exit" );
        n = put.nextInt();
       if(x ==n)
         {
         menu();
         }
           }
     }
       public  void menu()
    {
         
       int userinput1=1;
       int a;
        Scanner put = new Scanner (System.in);
        System.out.println("Please select one of the following Menu items:");
        System.out.println("(1) Capture new student");
        System.out.println("(2) Search for student");
        System.out.println("(3) Delete a student");
        System.out.println("(4) Print student report");
        System.out.println("(5) exit application");
         a = put.nextInt();
        
        if(userinput1==a)
        {
           SaveStudent();  
        }
        else if(a==2)
        {
            SearchStudent();
        }
        else if(a==3)
        {
            DeleteStudent();
        }
        else if(a==4)
        {
            StudentReport();
        }
          else if(a==5)
        {
            return;
        }
    }

}

