import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class GameOver extends Actor
{
    public void act() 
    {
        getWorld().removeObjects(getObjectsInRange(1000, Ship.class));
        getWorld().removeObjects(getObjectsInRange(1000, Rope.class));
    }    
}
