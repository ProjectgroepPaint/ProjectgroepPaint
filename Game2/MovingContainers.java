import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MovingContainers extends Actor
{
    public final int SPEED=2;
    public void MoveR() 
    {
        setLocation(getX() +SPEED, getY());
        if (getX()>1490){  
          getWorld().removeObject(this);  
        }
    }
    public void MoveL() 
    {
        setLocation(getX() -SPEED, getY());
        if (getX()<10){  
          getWorld().removeObject(this);  
        }
    }
}
