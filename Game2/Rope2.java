import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rope2 extends Crane2
{
    private int speed = 8;
    
    public void act() 
    {
        if (Greenfoot.isKeyDown("A") && getX()>933)
        {move (-speed); turn(3);}

        if (Greenfoot.isKeyDown("D") && getX()<1250)
        {move (speed);}

        setRotation(90);
  
        if (Greenfoot.isKeyDown("W"))  
        {move(-4);}
  
        if (Greenfoot.isKeyDown("S"))  
        {move(4);}
  
        setRotation(0);
    }
}