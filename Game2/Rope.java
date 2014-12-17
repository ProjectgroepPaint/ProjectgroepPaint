import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rope extends Crane
{
    private int speed = 8;
    
    public void act() 
    {
        if (Greenfoot.isKeyDown("left") && getX()>209)
        {move (-speed); turn(3);}

        if (Greenfoot.isKeyDown("right") && getX()<526)
        {move (speed);}

        setRotation(90);
  
        if (Greenfoot.isKeyDown("up"))  
        {move(-4);}
  
        if (Greenfoot.isKeyDown("down"))  
        {move(4);}
  
        setRotation(0);
    }
}