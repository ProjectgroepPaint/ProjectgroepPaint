import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class button2 extends Actor
{
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))  
        {  
            Greenfoot.setWorld(new Game2());
            // Sets world to game2.
        }  
    }    
}
