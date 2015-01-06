import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rope2 extends Crane2
{
    public int minimum_offsetHook = 933;
    public int maximum_offsetHook = 1250;
    public int minimum_offsetRope = 946;
    public int maximum_offsetRope = 1263;
    private final int VERTICAL_MOVEMENT = 4;
    public void act()
    {
        Ropemove();
    }
    public void Ropemove() 
    {
        if (Greenfoot.isKeyDown("A") && getX()>minimum_offsetRope || Greenfoot.isKeyDown("D") && getX()<maximum_offsetRope)
        {Cranemove2 (velocity);}
        
        // Method call to force the rope to stay vertical
        setRotation(90);
  
        if (Greenfoot.isKeyDown("W"))  
        {move(-VERTICAL_MOVEMENT);}
        if (Greenfoot.isKeyDown("S") && getY()<536)  
        {move(VERTICAL_MOVEMENT);}
        
        // Method call to force the rope to stay vertical
        setRotation(0);
    }
    public void Hookmove() 
    {
        if (Greenfoot.isKeyDown("A") && getX()>minimum_offsetHook || Greenfoot.isKeyDown("D") && getX()<maximum_offsetHook)
        {Cranemove2 (velocity);}
        
        // Method call to force the rope to stay vertical
        setRotation(90);
  
        if (Greenfoot.isKeyDown("W") && getY()>340)  
        {move(-VERTICAL_MOVEMENT);}
        if (Greenfoot.isKeyDown("S") && getY()<876)  
        {move(VERTICAL_MOVEMENT);}
        
        // Method call to force the rope to stay vertical
        setRotation(0);
    }
}