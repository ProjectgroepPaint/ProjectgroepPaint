import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crane extends Actor
{
    /**
     * Act - do whatever the Crane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    public void spawn_Crane ()
    {
        boolean spawned = false;
        while(!spawned) {
            int x = 5;
            int y = 5;
            Crane myCrane = new Crane();
            getWorld().addObject(new Crane(), 10, 10);
            spawned = true;
        }
    }
}