import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rope extends Crane
{
    public int minimum_offsetHook = 209;
    public int maximum_offsetHook = 526;
    public int minimum_offsetRope = 222;
    public int maximum_offsetRope = 539;
    private final int VERTICAL_MOVEMENT = 4;
    public void act()
    {
        Ropemove();
    }
    public void Ropemove() 
    {
        if (Greenfoot.isKeyDown("left") && getX()>minimum_offsetRope || Greenfoot.isKeyDown("right") && getX()<maximum_offsetRope)
        {Cranemove (velocity);}
        
        // Method call to force the rope to stay vertical
        setRotation(90);
  
        if (Greenfoot.isKeyDown("up"))  
        {move(-VERTICAL_MOVEMENT);}
        if (Greenfoot.isKeyDown("down") && getY()<536)  
        {move(VERTICAL_MOVEMENT);}
        
        // Method call to force the rope to stay vertical
        setRotation(0);
    }
    public void Hookmove() 
    {
        if (Greenfoot.isKeyDown("left") && getX()>minimum_offsetHook || Greenfoot.isKeyDown("right") && getX()<maximum_offsetHook)
        {Cranemove (velocity);}
        
        // Method call to force the rope to stay vertical
        setRotation(90);
  
        if (Greenfoot.isKeyDown("up") && getY()>340)  
        {move(-VERTICAL_MOVEMENT);}
        if (Greenfoot.isKeyDown("down") && getY()<876)  
        {move(VERTICAL_MOVEMENT);}
        
        // Method call to force the rope to stay vertical
        setRotation(0);
    }
}