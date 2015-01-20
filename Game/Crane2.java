import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crane2 extends Cranes
{
    private int minimum_offset = 836;
    private int maximum_offset = 1153;
    // X-Coordinates of the left and right bound for Player2Crane.
    public void act() 
    {
        // Removes the AICrane from the world.
        getWorld().removeObjects(getObjectsInRange(1000, AICrane.class));
        getWorld().removeObjects(getObjectsInRange(1000, AIRope.class));
        getWorld().removeObjects(getObjectsInRange(1000, AIHook.class));
        
        // Moves the PlayerCrane if the buttons are pressed.
        if (Greenfoot.isKeyDown("A") && getX()>minimum_offset || Greenfoot.isKeyDown("D") && getX()<maximum_offset)
        {
            Cranemove2 (velocity);
        }  
    }
}
