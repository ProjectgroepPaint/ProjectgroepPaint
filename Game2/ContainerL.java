import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class ContainerL extends Container
{
    private Background background;
    public void addedToWorld(World world) 
    {
       background = (Background) world; 
    }
    public void act() 
    {
        setLocation(getX() -2, getY());
        if (getX()<10){  
          getWorld().removeObject(this);  
        }
    }
}
