import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ship2 here.
 * Code for the Ship2 to load the containers on to.
 */
public class Ship2 extends Actor
{
    /**
     * Act - do whatever the Ship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    public void spawn_Ship2 ()
    {
        boolean spawned = false;
        while(!spawned) {
            int x = 5;
            int y = 5;
            Ship2 myShip2 = new Ship2();
            getWorld().addObject(new Ship2(), 10, 10);
            spawned = true;
        }
    }
}
