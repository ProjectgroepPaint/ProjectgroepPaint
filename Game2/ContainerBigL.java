import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class ContainerBigL extends ContainerBig
{
    public void act() 
    {
        setLocation(getX() -2, getY());
        if (getX()<10){  
          getWorld().removeObject(this);  
        }
    }    
}
