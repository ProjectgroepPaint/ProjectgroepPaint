import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Cranes extends Actor
{
    protected final int velocity = 8;
    // The speed with which the cranes move.
    protected void Cranemove(int velocity) 
    {
        // Moves the PlayerCrane if the buttons are pressed.
        if (Greenfoot.isKeyDown("left"))
        {
            move (-velocity);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move (velocity);
        }
    }
    protected void Cranemove2(int velocity) 
    {
        // Moves the Player2Crane if the buttons are pressed.
        if (Greenfoot.isKeyDown("A"))
        {
            move (-velocity);
        }
        if (Greenfoot.isKeyDown("D"))
        {
            move (velocity);
        }
    }
    protected void CranemoveAI(int velocity)
    {
            move (velocity/2);
            // Halves the speed with which cranes move for the AI.
    }
}
