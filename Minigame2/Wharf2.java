import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wharf2 here.
 * The Wharf on which the containers are stacked, which will be shipped to the Ship
 */
public class Wharf2 extends Actor
{
    /**
     * Act - do whatever the Wharf wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    public void spawn_Wharf2 ()
    {
        boolean spawned = false;
        while(!spawned) {
            int x = 5;
            int y = 5;
            Wharf2 myWharf2 = new Wharf2();
            getWorld().addObject(new Wharf2(), 10, 10);
            spawned = true;
        }
    }
}
