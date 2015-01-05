import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hookwithnuclearcontainer extends Hook
{
    private Background Scene;
    
    public void addedToWorld(World world) 
    {
       Scene = (Background) world; 
    }
    public void act() 
    {
        Hookmove();
        
        if (getY()<563 && Greenfoot.isKeyDown("space") && getOneIntersectingObject (ContaineronShip.class) == null)
        {getWorld().addObject(new Container3(), getX(), getY());
         Scene.addObject(new Hook(), getX(), getY());
         Scene.removeObject(this);
        }
    }    
}
