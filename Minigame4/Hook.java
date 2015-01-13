import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hook extends Actor
{
   private int speed = 1;
   
    public void act() 
    {
        move();
        checkLevel();
    }    
    
    public void move() 
    {
          setLocation(getX()+speed, getY());
    }
    
    public void checkLevel() {
        if (Level04.class.isInstance(getWorld())) {
            speed = 2; 
        }
        else if (Level05.class.isInstance(getWorld())) {
            speed = 2; 
        }
    }
}
