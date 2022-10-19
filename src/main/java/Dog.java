
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog
{
    private String name;
    private boolean isAlive;

    public Dog(){
        name = "Felix";
        isAlive = true;
    }

    // implement the non-default constructor below this line

    // implement the non-default constructor above this line

    public String getName(){
        return name;
    }

    // implement the setName method below this line

    // implement the setName method above this line

    public boolean isDead() {
        return !isAlive;
    }

    // implement the die method below this line

    // implement the die method above this line

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", isAlive=" + isAlive +
                '}';
    }
}
