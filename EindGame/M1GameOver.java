import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class M1GameOver extends Actor
{
    public void act() 
    {
        getWorld().removeObjects(getObjectsInRange(1000, M1Ship.class));
        getWorld().removeObjects(getObjectsInRange(1000, M1Rope.class));
    }    
}
