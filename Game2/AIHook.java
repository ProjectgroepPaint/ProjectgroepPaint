import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AIHook extends AIRope
{
    private Background Scene;
    public void addedToWorld(World world) 
    {Scene = (Background) world;}
    public void setVERTICAL_MOVEMENT()
    {
        if (getY()<875)
        {VERTICAL_MOVEMENT = 4;}
        else {VERTICAL_MOVEMENT = 0;}
    }
    public static int getVERTICAL_MOVEMENT()
    {
        return VERTICAL_MOVEMENT;
    }    
    public void act() 
    {
        AICrane.getmoveRight();
        setVERTICAL_MOVEMENT();
        Ropemove();
        setmoveRight();
        
        if (getOneIntersectingObject (Container.class) != null)
        {
            Scene.addObject(new AIHookwithcontainer(), getX(), getY());
            getWorld().removeObjects(getObjectsInRange(50, Container.class));
            Scene.removeObject(this);
            
        }
        else if (getOneIntersectingObject (ContainerBig.class) != null)
        {
            Scene.addObject(new AIHookwithbigcontainer(), getX(), getY());
            getWorld().removeObjects(getObjectsInRange(80, ContainerBig.class));
            Scene.removeObject(this);
            
        } 
    }
}