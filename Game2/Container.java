import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Container extends MovingContainers
{
    private Background background;
    public void addedToWorld(World world) 
    {
       background = (Background) world; 
    }
    public void act() 
    {
        setLocation(getX() +2, getY());
        if (getX()>1490){  
          getWorld().removeObject(this);  
        }
    }
}
