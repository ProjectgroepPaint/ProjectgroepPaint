import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hook2 extends Rope2
{
    private Game2 Scene;
    protected void addedToWorld(World world) 
    {
        Scene = (Game2) world;
    }
        
    public void act() 
    {
        Hookmove();        
        
        // Checks if the hook is touching a container, spawns a hook with a container and removes the container and hook from the world.
        if (Greenfoot.isKeyDown("Q") && getOneIntersectingObject (Container.class) != null)
        {
            Scene.addObject(new Hookwithcontainer2(), getX(), getY());
            getWorld().removeObjects(getIntersectingObjects(Container.class));
            Scene.removeObject(this);
        }
        else if (Greenfoot.isKeyDown("Q") && getOneIntersectingObject (ContainerBig.class) != null)
        {
            Scene.addObject(new Hookwithbigcontainer2(), getX(), getY());
            getWorld().removeObjects(getIntersectingObjects(ContainerBig.class));
            Scene.removeObject(this);            
        }
        else if (Greenfoot.isKeyDown("Q") && getOneIntersectingObject (MysteryContainer.class) != null)
        {
            Scene.addObject(new Hookwithmysterycontainer2(), getX(), getY());
            getWorld().removeObjects(getIntersectingObjects(MysteryContainer.class));
            Scene.removeObject(this);            
        }
        else if (Greenfoot.isKeyDown("Q") && getOneIntersectingObject (NuclearContainer.class) != null)
        {
            Scene.addObject(new Hookwithnuclearcontainer2(), getX(), getY());
            getWorld().removeObjects(getIntersectingObjects(NuclearContainer.class));
            Scene.removeObject(this);            
        }
    }
}
