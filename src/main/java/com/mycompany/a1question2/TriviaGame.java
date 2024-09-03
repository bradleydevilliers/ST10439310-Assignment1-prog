
package com.mycompany.a1question2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class TriviaGame 
{
    private ArrayList<Animal>animals;
   private  Random random;
    private Scanner scan;
    
    public TriviaGame()
    {
        animals = new ArrayList<>();
        random = new Random();
        scan = new Scanner(System.in);
        animals.add(new mammal("Lion","Panthera leo","what is a lions habitat","Savanna","Golden",110));
        animals.add(new mammal("Giraffe","camelopardalis","how many spots does a geiraffe have?","Savanna","Orange",89));
        animals.add(new mammal("Kangaroo","Marcopus giganteus","what is so unique about a kangaroos?","Austrlia","Brown",78));
        
        animals.add(new bird("Eagle","Accipiter gentilis","what is the Eagles prey?","Small","brown",6));
        animals.add(new bird("Parrot","Psittacus erithacus","what is so special about a parrots beak ?","Strong","blue",34));
         animals.add(new bird("Ostrich","Struthio camelus","How fast can a ostrich run?","30kmh","black",13));
         
          animals.add(new reptile("Snake","Serpentes ","what is a snakes primary ssense organ?","Jacobs organ","Green",5));
          animals.add(new reptile("Crocodile","Crocodylus acutus ","what is unique about a crocodiles ?","bothe land and water animals","brown",2));
            animals.add(new reptile("turtle","TesTudines ","what is a  turtle protective feature?","Shell","green",1));
    }
    public ArrayList<Animal>getAnimals(){
        return animals;
    }
    
    public void PlayGame()
    {
        Animal selectedAnimal=animals.get(random.nextInt(animals.size()));
        System.out.println(selectedAnimal.gettriviaQ());
      
        
        System.out.println("Enter your answer");
        String userAnswer=scan.nextLine();
        if(userAnswer.equalsIgnoreCase(selectedAnimal.getcorrectAnswer()))
        {
            System.out.println("Correct");
            
        }else{
             System.out.println("sorry that was inCorrect, the correct answer is "+ selectedAnimal.getcorrectAnswer());
        }
    }
}
