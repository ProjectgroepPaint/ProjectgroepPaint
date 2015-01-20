import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hookwithbigcontainer extends Hook
{
    private Game2 Scene;
    
    protected void addedToWorld(World world) 
    {
       Scene = (Game2) world; 
    }
    public void act() 
    {
        Hookmove();
        // Checks if its possible to spawn a container.
        if (getY()<563 && Greenfoot.isKeyDown("space") && getOneIntersectingObject (ContaineronShip.class) == null)
        {getWorld().addObject(new Container2(), getX(), getY());
         Scene.addObject(new Hook(), getX(), getY());
         Scene.removeObject(this);
        }
    }    
}
