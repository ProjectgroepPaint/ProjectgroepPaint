import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AICrane extends Cranes
{
    private int minimum_offset = 836;
    private int maximum_offset = 1153;
    public static boolean moveLeft;
    public static boolean moveRight;
    public static boolean setmoveRight()
    {
        moveRight = true;
        return moveRight;
    }
    public static boolean stopmoveRight()
    {
        moveRight = false;
        return moveRight;
    }
    public static boolean getmoveRight()
    {
        return moveRight;
    }
    
    public void act() 
    {
       getmoveRight();
       if (getX()>1149)
       {
           moveRight = false;
           moveLeft = true;
       }
       if (getX()<840)
       {
           moveRight = true;
           moveLeft = false;
       }
       if(getX() > minimum_offset && moveLeft == true)
       {CranemoveAI(-velocity);}
       else if (getX() < maximum_offset && moveRight == true)
       {CranemoveAI(velocity);}
    }
}
