import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class button7 extends Actor
{
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))  
        {  
            Greenfoot.setSpeed(50);
            Greenfoot.setWorld(new Menu());  
        }
    }    
}
