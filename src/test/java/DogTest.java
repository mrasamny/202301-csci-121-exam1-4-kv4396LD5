import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    @DisplayName("[10] test constructor")
    void test_constructor(){
        Dog barlow = new Dog("Barlow");
        String expected = "Dog{name='Barlow', isAlive=true}";
        String actual = barlow.toString();
        assertTrue(expected.equals(actual),"Expected:\n"+expected+"\n\nActual:\n"+actual);
        Dog panda = new Dog("Panda");
        expected = "Dog{name='Panda', isAlive=true}";
        actual = panda.toString();
        assertTrue(expected.equals(actual),"Expected:\n"+expected+"\n\nActual:\n"+actual);
    }

    @Test
    @DisplayName("[10] test setName")
    void setName() {
        Dog barlow = new Dog();
        barlow.setName("Barlow");
        String expected = "Dog{name='Barlow', isAlive=true}";
        String actual = barlow.toString();
        assertTrue(expected.equals(actual),"Expected:\n"+expected+"\n\nActual:\n"+actual);
        Dog panda = new Dog();
        panda.setName("Panda");
        expected = "Dog{name='Panda', isAlive=true}";
        actual = panda.toString();
        assertTrue(expected.equals(actual),"Expected:\n"+expected+"\n\nActual:\n"+actual);
    }

    @Test
    @DisplayName("[10] test die")
    void die() {
        Dog barlow = new Dog();
        barlow.die();
        String expected = "Dog{name='Felix', isAlive=false}";
        String actual = barlow.toString();
        assertTrue(expected.equals(actual),"Expected:\n"+expected+"\n\nActual:\n"+actual);
        Dog panda = new Dog();
        panda.die();
        expected = "Dog{name='Felix', isAlive=false}";
        actual = panda.toString();
        assertTrue(expected.equals(actual),"Expected:\n"+expected+"\n\nActual:\n"+actual);
    }
}