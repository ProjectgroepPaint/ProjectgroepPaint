import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class button7 extends Actor
{
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))  
        {  
            Greenfoot.setSpeed(50);
            // Returns the gamespeed to normal.
            Greenfoot.setWorld(new Menu());
            // Sets world back to the menu.
        }
    }    
}
