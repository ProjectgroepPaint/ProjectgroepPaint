import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Container1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Container1 extends Actor
{
    /**
     * Act - do whatever the Container1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int i = 0;
    public void act() 
    {
        setLocation(getX(), getY() + i);
        if (getY()>563){  
           i = 0;
           return;
        };
        if (getY()<564){  
           i = 2;
           return;
        };
    }    
}
