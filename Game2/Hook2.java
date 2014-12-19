import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hook2 extends Rope2
{
    private Background Scene;
    public void addedToWorld(World world) 
    {Scene = (Background) world;}
        
    public void act() 
    {
        Ropemove();        
        
        if (Greenfoot.isKeyDown("Q") && getOneIntersectingObject (Container.class) != null)
        {
            Scene.addObject(new Hookwithcontainer2(), getX(), getY());
            getWorld().removeObjects(getObjectsInRange(50, Container.class));
            Scene.removeObject(this);
            
        }
        else if (Greenfoot.isKeyDown("Q") && getOneIntersectingObject (ContainerBig.class) != null)
        {
            Scene.addObject(new Hookwithbigcontainer2(), getX(), getY());
            getWorld().removeObjects(getObjectsInRange(80, ContainerBig.class));
            Scene.removeObject(this);
            
        } 
    }
}