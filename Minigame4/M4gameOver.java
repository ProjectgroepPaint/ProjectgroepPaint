import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class M4gameOver extends Actor
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
    if (Greenfoot.isKeyDown("r") && (M4Level01.class.isInstance(getWorld())))
        {
            Greenfoot.setWorld(new M4Level01());  
        }  
    else if (Greenfoot.isKeyDown("r") && (M4Level02.class.isInstance(getWorld())))
        {
            Greenfoot.setWorld(new M4Level02());  
        }
    else if (Greenfoot.isKeyDown("r") && (M4Level03.class.isInstance(getWorld())))
        {
            Greenfoot.setWorld(new M4Level03());  
        }
    else if (Greenfoot.isKeyDown("r") && (M4Level04.class.isInstance(getWorld())))
        {
            Greenfoot.setWorld(new M4Level04());  
        }
    else if (Greenfoot.isKeyDown("r") && (M4Level05.class.isInstance(getWorld())))
        {
            Greenfoot.setWorld(new M4Level05());  
        }
    }
}
