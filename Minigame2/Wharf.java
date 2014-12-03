import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wharf here.
 * The Port on which the containers are stacked, which will be shipped to the Ship
 */
public class Wharf extends Actor
{
    /**
     * Act - do whatever the Wharf wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    public void spawn_Wharf ()
    {
        boolean spawned = false;
        while(!spawned) {
            int x = 5;
            int y = 5;
            Wharf myWharf = new Wharf();
            getWorld().addObject(new Wharf(), 10, 10);
            spawned = true;
        }
    }
}
