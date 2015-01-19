import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hook extends Rope
{
    private Game2 Scene;
    
    public void addedToWorld(World world) 
    {
       Scene = (Game2) world; 
    }
        
    public void act() 
    {
        Hookmove();        
        
        // Checks if the hook is touching a container, spawns a hook with a container and removes the container and hook from the world.
        if (Greenfoot.isKeyDown("space") && getOneIntersectingObject (Container.class) != null)
        {
            Scene.addObject(new Hookwithcontainer(), getX(), getY());
            getWorld().removeObjects(getIntersectingObjects(Container.class));
            Scene.removeObject(this);            
        }
        else if (Greenfoot.isKeyDown("space") && getOneIntersectingObject (ContainerBig.class) != null)
        {
            Scene.addObject(new Hookwithbigcontainer(), getX(), getY());
            getWorld().removeObjects(getIntersectingObjects(ContainerBig.class));
            Scene.removeObject(this);            
        }
        else if (Greenfoot.isKeyDown("space") && getOneIntersectingObject (MysteryContainer.class) != null)
        {
            Scene.addObject(new Hookwithmysterycontainer(), getX(), getY());
            getWorld().removeObjects(getIntersectingObjects(MysteryContainer.class));
            Scene.removeObject(this);            
        }
        else if (Greenfoot.isKeyDown("space") && getOneIntersectingObject (NuclearContainer.class) != null)
        {
            Scene.addObject(new Hookwithnuclearcontainer(), getX(), getY());
            getWorld().removeObjects(getIntersectingObjects(NuclearContainer.class));
            Scene.removeObject(this);            
        }
    }
}
