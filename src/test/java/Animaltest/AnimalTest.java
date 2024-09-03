/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Animaltest;

import com.mycompany.a1question2.Animal;
import com.mycompany.a1question2.TriviaGame;
import com.mycompany.a1question2.bird;
import com.mycompany.a1question2.mammal;
import com.mycompany.a1question2.reptile;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class AnimalTest {
    
    public AnimalTest() {
    }
      @Test
    public void testAnimalConstructor() {
        Animal animal = new Animal("Lion", "Panthera leo", "What is the lion's habitat?", "Savanna");
        assertEquals("Lion", animal.getName());
        assertEquals("Panthera leo", animal.getSpecies());
        assertEquals("What is the lion's habitat?", animal.gettriviaQ());
        assertEquals("Savanna", animal.getcorrectAnswer());
    }

    @Test
    public void testMammalConstructor() {
        mammal mammal = new mammal("Lion", "Panthera leo", "What is the lion's habitat?", "Savanna", "Golden", 110);
        assertEquals("Lion", mammal.getName());
        assertEquals("Panthera leo", mammal.getSpecies());
        assertEquals("What is the lion's habitat?", mammal.gettriviaQ());
        assertEquals("Savanna", mammal.getcorrectAnswer());
        assertEquals("Golden", mammal.getFurcolor());
        assertEquals(110, mammal.getgestationPeriod());
    }

    @Test
    public void testBirdConstructor() {
        bird bird = new bird("Eagle", "Accipiter gentilis", "What is the eagle's prey?", "Small mammals", "Brown", 6);
        assertEquals("Eagle", bird.getName());
        assertEquals("Accipiter gentilis", bird.getSpecies());
        assertEquals("What is the eagle's prey?", bird.gettriviaQ());
        assertEquals("Small mammals", bird.getcorrectAnswer());
        assertEquals("Brown", bird.getFeathercolor());
        assertEquals(6, bird.getwingSpan());
    }

    @Test
    public void testReptileConstructor() {
        reptile reptile = new reptile("Snake", "Serpentes", "What is the snake's primary sense organ?", "Jacobson's organ", "Green", 4);
        assertEquals("Snake", reptile.getName());
        assertEquals("Serpentes", reptile.getSpecies());
        assertEquals("What is the snake's primary sense organ?", reptile.gettriviaQ());
        assertEquals("Jacobson's organ", reptile.getcorrectAnswer());
        assertEquals("Green", reptile.getScaleColor());
        assertEquals(4, reptile.getSheddingfrequency());
    }

    @Test
    public void testTriviaGame() {
        TriviaGame game = new TriviaGame();
        assertNotNull(game.getAnimals());
        assertTrue(game.getAnimals().size() > 0);
    }

    @Test
    public void testPlayGame() {
        TriviaGame game = new TriviaGame();
        game.PlayGame();
        
    }

    @Test
    public void testGetCorrectAnswer() {
        Animal animal = new Animal("Lion", "Panthera leo", "What is the lion's habitat?", "Savanna");
        assertEquals("Savanna", animal.getcorrectAnswer());
    }

    @Test
    public void testGetTriviaQuestion() {
        Animal animal = new Animal("Lion", "Panthera leo", "What is the lion's habitat?", "Savanna");
        assertEquals("What is the lion's habitat?", animal.gettriviaQ());
    }

    @Test
    public void testGetName() {
        Animal animal = new Animal("Lion", "Panthera leo", "What is the lion's habitat?", "Savanna");
        assertEquals("Lion", animal.getName());
    }

    @Test
    public void testGetSpecies() {
        Animal animal = new Animal("Lion", "Panthera leo", "What is the lion's habitat?", "Savanna");
        assertEquals("Panthera leo", animal.getSpecies());
    }
}
