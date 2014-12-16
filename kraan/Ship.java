import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ship here.
 * Code for the Ship to load the containers on to.
 */
public class Ship extends Actor
{
    /**
     * Act - do whatever the Ship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    public void spawn_Ship ()
    {
        boolean spawned = false;
        while(!spawned) {
            int x = 5;
            int y = 5;
            Ship myShip = new Ship();
            getWorld().addObject(new Ship(), 10, 10);
            spawned = true;
        }
    }
}
