import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class button4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class button4 extends Actor
{
    /**
     * Act - do whatever the button4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))  
        {  
            Greenfoot.setWorld(new Game4());  
        }
    }    
}
