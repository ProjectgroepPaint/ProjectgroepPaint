import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class button5 extends Actor
{
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))  
        {  
            Greenfoot.setWorld(new Menu());
            Game1.ResetBGSpeed();
            M1Obstacle.Reset();
        }
    }    
}
