import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AIHook extends AIRope
{
    private Game2 Scene;
    protected void addedToWorld(World world) 
    {Scene = (Game2) world;}
    private void setVERTICAL_MOVEMENT()
    {
        // Moves hook down.
        if (getY()<875)
        {VERTICAL_MOVEMENT = 4;}
        else {VERTICAL_MOVEMENT = 0;}
    }
    protected static int getVERTICAL_MOVEMENT()
    {
        return VERTICAL_MOVEMENT;
    }    
    public void act() 
    {
        AICrane.getmoveRight();
        setVERTICAL_MOVEMENT();
        Hookmove();
        setmoveRight();
        
        // Picks up container if possible.
        if (getOneIntersectingObject (Container.class) != null)
        {
            Scene.addObject(new AIHookwithcontainer(), getX(), getY());
            getWorld().removeObjects(getIntersectingObjects(Container.class));
            Scene.removeObject(this);
        }
        else if (getOneIntersectingObject (ContainerBig.class) != null)
        {
            Scene.addObject(new AIHookwithbigcontainer(), getX(), getY());
            getWorld().removeObjects(getIntersectingObjects(ContainerBig.class));
            Scene.removeObject(this);
        }
        else if (getOneIntersectingObject (MysteryContainer.class) != null)
        {
            if (Math.random() > 0.98)
            {
                Scene.addObject(new AIHookwithmysterycontainer(), getX(), getY());
                getWorld().removeObjects(getIntersectingObjects(MysteryContainer.class));
                Scene.removeObject(this);
            }
        }
    }
}
