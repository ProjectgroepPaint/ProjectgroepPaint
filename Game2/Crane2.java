import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crane2 extends Actor
{
    private int speed = 8;
    
    public void act() 
    {
        getWorld().removeObjects(getObjectsInRange(100, ComputerCrane.class));
        getWorld().removeObjects(getObjectsInRange(10000, Button.class));
        if (Greenfoot.isKeyDown("A") && getX()>836)
        {
            move (-speed);
        }
        if (Greenfoot.isKeyDown("D") && getX()<1153)
        {
            move (speed); 
        }    
    }
}
