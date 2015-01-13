import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Obstacle extends Actor
{
    public void act() 
    {
        // Add your action code here.
    }
    public void ObstacleMove()
    {
        setLocation(getX(), getY() + 2); 
        if (getY()>595)
        {  
            getWorld().removeObject(this);  
        }
    }
}
