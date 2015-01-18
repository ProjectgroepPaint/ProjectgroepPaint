import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class button3 extends Actor
{
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))  
        {  
            Greenfoot.setWorld(new Game3());  
        }
    }    
}
