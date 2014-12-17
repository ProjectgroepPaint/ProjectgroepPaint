import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crane extends Actor
{
    private int speed = 8;
    
    public void act() 
    {
        if (Greenfoot.isKeyDown("left") && getX()>112)
        {
            move (-speed);
        }
        if (Greenfoot.isKeyDown("right") && getX()<429)
        {
            move (speed);
        }    
    }
}
