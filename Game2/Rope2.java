import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rope2 extends Crane2
{
    public int minimum_offset = 933;
    public int maximum_offset = 1250;
    private final int VERTICAL_MOVEMENT = 4;
    public void act()
    {
        Ropemove();
    }
    public void Ropemove() 
    {
        if (Greenfoot.isKeyDown("A") && getX()>minimum_offset || Greenfoot.isKeyDown("D") && getX()<maximum_offset)
        {Cranemove2 (velocity);}
        
        // Method call to force the rope to stay vertical
        setRotation(90);
  
        if (Greenfoot.isKeyDown("W"))  
        {move(-VERTICAL_MOVEMENT);}
        if (Greenfoot.isKeyDown("S"))  
        {move(VERTICAL_MOVEMENT);}
        
        // Method call to force the rope to stay vertical
        setRotation(0);
    }
}