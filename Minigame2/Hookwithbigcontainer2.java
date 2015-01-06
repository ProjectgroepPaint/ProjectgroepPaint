import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hookwithbigcontainer2 extends Hook2
{
    private Background Scene;
    
    public void addedToWorld(World world) 
    {
       Scene = (Background) world; 
    }
    public void act() 
    {
       Hookmove();
        if (getY()<563 && Greenfoot.isKeyDown("Q") && getOneIntersectingObject (ContaineronShip.class) == null)
        {getWorld().addObject(new Container2(), getX(), getY());
         Scene.addObject(new Hook2(), getX(), getY());
         Scene.removeObject(this);
        }
    }    
}
