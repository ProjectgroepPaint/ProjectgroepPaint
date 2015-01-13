import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameOver extends Actor
{
    /**
     * Act - do whatever the gameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        restart();
    }
    
    public void restart() {
    if (Greenfoot.isKeyDown("r") && (Level01.class.isInstance(getWorld())))
        {
            Greenfoot.setWorld(new Level01());  
        }  
    else if (Greenfoot.isKeyDown("r") && (Level02.class.isInstance(getWorld())))
        {
            Greenfoot.setWorld(new Level02());  
        }
    else if (Greenfoot.isKeyDown("r") && (Level03.class.isInstance(getWorld())))
        {
            Greenfoot.setWorld(new Level03());  
        }
    else if (Greenfoot.isKeyDown("r") && (Level04.class.isInstance(getWorld())))
        {
            Greenfoot.setWorld(new Level04());  
        }
    else if (Greenfoot.isKeyDown("r") && (Level05.class.isInstance(getWorld())))
        {
            Greenfoot.setWorld(new Level05());  
        }
    }
}
