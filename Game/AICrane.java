import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AICrane extends Cranes
{
    private int minimum_offset = 836;
    private int maximum_offset = 1153;
    // X-Coordinates of the left and right bound for AICrane.
    protected static boolean moveLeft;
    protected static boolean moveRight;
    protected static boolean setmoveRight()
    {
        moveRight = true;
        return moveRight;
        // Sets the boolean which makes the AICrane move right true.
    }
    protected static boolean stopmoveRight()
    {
        moveRight = false;
        return moveRight;
        // Sets the boolean which makes the AICrane move right false.
    }
    protected static boolean stopmoveLeft()
    {
        moveLeft = false;
        return moveLeft;
        // Sets the boolean which makes the AICrane move left false.
    }
    protected static boolean getmoveRight()
    {
        return moveRight;
        // Returns if moveRight is true or false.
    }
    protected static boolean getmoveLeft()
    {
        return moveLeft;
        // Returns if moveLeft is true or false.
    }
    
    public void act() 
    {
       getmoveRight();
       if (getX()>1149)
       {
           moveRight = false;
           moveLeft = true;
           // Makes the AICrane go Left if almost at right edge of the screen.
       }
       if (getX()<840)
       {
           moveRight = true;
           moveLeft = false;
           // Makes the AICrane go Right if almost at left edge of the screen.
       }
       if(getX() > minimum_offset && moveLeft == true)
       {CranemoveAI(-velocity);}
       else if (getX() < maximum_offset && moveRight == true)
       {CranemoveAI(velocity);}
    }
}
