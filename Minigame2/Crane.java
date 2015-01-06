import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crane extends Cranes
{
    private int minimum_offset = 112;
    private int maximum_offset = 429;
    public void act() 
    {
        if (Greenfoot.isKeyDown("left") && getX()>minimum_offset || Greenfoot.isKeyDown("right") && getX()<maximum_offset)
        {
            Cranemove (velocity);
        }
    }
}
