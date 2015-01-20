import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crane extends Cranes
{
    private int minimum_offset = 112;
    private int maximum_offset = 429;
    // X-Coordinates of the left and right bound for PlayerCrane.
    public void act() 
    {
        // Moves the PlayerCrane if the buttons are pressed.
        if (Greenfoot.isKeyDown("left") && getX()>minimum_offset || Greenfoot.isKeyDown("right") && getX()<maximum_offset)
        {
            Cranemove (velocity);
        }
    }
}
