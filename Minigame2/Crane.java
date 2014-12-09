import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crane extends Actor
{
    private int speed = 8;
    
    /**
     * Act - do whatever the Crane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if (Greenfoot.isKeyDown("left"))
        {
            move (-speed);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move (speed); 
        }
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
