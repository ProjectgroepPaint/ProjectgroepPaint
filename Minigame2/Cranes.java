import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Cranes extends Actor
{
    public final int velocity = 8;
    public void Cranemove(int velocity) 
    {
        if (Greenfoot.isKeyDown("left"))
        {
            move (-velocity);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move (velocity);
        }
    }
    public void Cranemove2(int velocity) 
    {
        if (Greenfoot.isKeyDown("A"))
        {
            move (-velocity);
        }
        if (Greenfoot.isKeyDown("D"))
        {
            move (velocity);
        }
    }
    public void CranemoveAI(int velocity)
    {
            move (velocity/2);
    }
}
