import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class button1 extends Actor
{
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))  
        {  
            Greenfoot.setWorld(new Game1());
            // Sets world to game1.
        }
    }    
}
