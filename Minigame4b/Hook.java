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
    }    
    
    public void move() 
    {
          setLocation(getX()+speed, getY());
    }
}
