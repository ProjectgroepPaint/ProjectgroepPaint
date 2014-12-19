import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rope extends Crane
{
    public int minimum_offset = 209;
    public int maximum_offset = 526;
    private final int VERTICAL_MOVEMENT = 4;
    public void act()
    {
        Ropemove();
    }
    public void Ropemove() 
    {
        if (Greenfoot.isKeyDown("left") && getX()>minimum_offset || Greenfoot.isKeyDown("right") && getX()<maximum_offset)
        {Cranemove (velocity);}
        
        // Method call to force the rope to stay vertical
        setRotation(90);
  
        if (Greenfoot.isKeyDown("up"))  
        {move(-VERTICAL_MOVEMENT);}
        if (Greenfoot.isKeyDown("down"))  
        {move(VERTICAL_MOVEMENT);}
        
        // Method call to force the rope to stay vertical
        setRotation(0);
    }
}