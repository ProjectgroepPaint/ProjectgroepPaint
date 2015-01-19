import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Win extends Actor
{
    public void act() 
    {
        getWorld().removeObjects(getObjectsInRange(1000000, MovingContainers.class));
    }    
}
