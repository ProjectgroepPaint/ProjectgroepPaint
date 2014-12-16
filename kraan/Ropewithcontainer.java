import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Haak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ropewithcontainer extends Actor
{
    private int speed = 8;
    public void act() 
    {
        if (Greenfoot.isKeyDown("left"))
        {move (-speed); turn(3);}

        if (Greenfoot.isKeyDown("right"))
        {move (speed);}

        setRotation(90);

  
        if (Greenfoot.isKeyDown("up"))  
        {move(-4);}
  
        if (Greenfoot.isKeyDown("down"))  
        {move(4);}
  
        setRotation(0);// Add your action code here.
    }    
}
