import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rope2 extends Crane2
{
    protected int minimum_offsetHook = 933;
    protected int maximum_offsetHook = 1250;
    // X-Coordinates of the left and right bound for Player2CraneHook.
    protected int minimum_offsetRope = 946;
    protected int maximum_offsetRope = 1263;
    // X-Coordinates of the left and right bound for Player2CraneRope.
    private final int VERTICAL_MOVEMENT = 4;
    // UP/DOWN - movement speed.
    public void act()
    {
        Ropemove();
    }
    protected void Ropemove() 
    {
        // Moves the Player2Rope if the buttons are pressed and the rope is between the minimum and maximum offset.
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
    protected void Hookmove() 
    {
        // Moves the Player2Hook if the buttons are pressed and the hook is between the minimum and maximum offset.
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
