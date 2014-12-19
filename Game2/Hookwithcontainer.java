import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hookwithcontainer extends Hook
{
    private Background Scene;
    
    public void addedToWorld(World world) 
    {
       Scene = (Background) world; 
    }
    public void act() 
    {
        Ropemove();
        if (getY()<563 && Greenfoot.isKeyDown("space") && getOneIntersectingObject (ContaineronShip.class) == null)
        {getWorld().addObject(new Container1(), getX(), getY());
         Scene.addObject(new Hook(), getX(), getY());
         Scene.removeObject(this);
        }
    }    
}
