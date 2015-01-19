import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Win extends Actor
{
    public void act() 
    {
        // "You won" image
        
        // Removes the containers that move from left to right at the bottom of the screen when time is up.
        getWorld().removeObjects(getObjectsInRange(1000000, MovingContainers.class));
    }    
}
