import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MovingContainers extends Actor
{
    // Movingspeed of the Containers.
    protected final int SPEED=2;
    
    // Method which makes containers move right and despawn at world edge.
    protected void MoveR() 
    {
        setLocation(getX() +SPEED, getY());
        if (getX()>1490){  
          getWorld().removeObject(this);  
        }
    }
    
    // Method which makes containers move left and despawn at world edge.
    protected void MoveL() 
    {
        setLocation(getX() -SPEED, getY());
        if (getX()<10){  
          getWorld().removeObject(this);  
        }
    }
}
