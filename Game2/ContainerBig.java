import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class ContainerBig extends MovingContainers
{
    public void act() 
    {
        setLocation(getX() +2, getY());
        if (getX()>1490){  
          getWorld().removeObject(this);  
        }
    }    
}
