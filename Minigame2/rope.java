import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rope here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rope extends Actor
{
     private int speed = 8;
    
    /**
     * Act - do whatever the rope wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
  
        setRotation(0);
    }    



}
