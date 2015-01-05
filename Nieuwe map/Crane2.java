import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crane2 extends Cranes
{
    private int minimum_offset = 836;
    private int maximum_offset = 1153;
    public void act() 
    {
        getWorld().removeObjects(getObjectsInRange(1000, AICrane.class));
        getWorld().removeObjects(getObjectsInRange(1000, AIRope.class));
        getWorld().removeObjects(getObjectsInRange(1000, AIHook.class));
        getWorld().removeObjects(getObjectsInRange(10000, Button.class));
        if (Greenfoot.isKeyDown("A") && getX()>minimum_offset || Greenfoot.isKeyDown("D") && getX()<maximum_offset)
        {
            Cranemove2 (velocity);
        }  
    }
}