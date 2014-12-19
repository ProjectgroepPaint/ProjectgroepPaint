import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hook extends Rope
{
    public Background Scene;
    
    public void addedToWorld(World world) 
    {
       Scene = (Background) world; 
    }
        
    public void act() 
    {
        Ropemove();        
        
        if (Greenfoot.isKeyDown("space") && getOneIntersectingObject (Container.class) != null)
        {
            Scene.addObject(new Hookwithcontainer(), getX(), getY());
            getWorld().removeObjects(getObjectsInRange(50, Container.class));
            Scene.removeObject(this);            
        }
        else if (Greenfoot.isKeyDown("space") && getOneIntersectingObject (ContainerBig.class) != null)
        {
            Scene.addObject(new Hookwithbigcontainer(), getX(), getY());
            getWorld().removeObjects(getObjectsInRange(80, ContainerBig.class));
            Scene.removeObject(this);            
        } 
    }
}