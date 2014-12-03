import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Container here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Container extends Actor
{
    /**
     * Act - do whatever the Container wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    public void spawn_Container ()
    {
        boolean spawned = false;
        while(!spawned) {
            int x = 5;
            int y = 5;
            Container myContainer = new Container();
            getWorld().addObject(new Container(), 10, 10);
            spawned = true;
        }
    }
}
