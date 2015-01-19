import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rope extends Crane
{
    public int minimum_offsetHook = 209;
    public int maximum_offsetHook = 526;
    // X-Coordinates of the left and right bound for PlayerCraneHook.
    public int minimum_offsetRope = 222;
    public int maximum_offsetRope = 539;
    // X-Coordinates of the left and right bound for PlayerCraneRope.
    private final int VERTICAL_MOVEMENT = 4;
    // UP/DOWN - movement speed.
    public void act()
    {
        Ropemove();
    }
    public void Ropemove() 
    {
        // Moves the PlayerRope if the buttons are pressed and the rope is between the minimum and maximum offset.
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
        // Moves the PlayerHook if the buttons are pressed and the hook is between the minimum and maximum offset.
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
