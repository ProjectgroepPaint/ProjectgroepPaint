import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class button5 extends Actor
{
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))  
        {  
            // Sets world back to the menu.
            Greenfoot.setWorld(new Menu());
            
            // Resets the background and obstaclespeed of game1.
            Game1.ResetBGSpeed();
            M1Obstacle.Reset();
        }
    }    
}
