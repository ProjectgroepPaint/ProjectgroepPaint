import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AIHookwithcontainer extends AIHook
{
    private Background Scene;
    public void setVERTICAL_MOVEMENT()
    {
        if (getY()>385)
        {VERTICAL_MOVEMENT = -4;}
        else {VERTICAL_MOVEMENT = 0;}
    }
    public static int getVERTICAL_MOVEMENT()
    {
        return VERTICAL_MOVEMENT;
    } 
    public void addedToWorld(World world) 
    {
       Scene = (Background) world; 
    }
    public void act() 
    {
        setVERTICAL_MOVEMENT();
        AICrane.getmoveRight();
        Ropemove();
        if (getY()>400 && getOneIntersectingObject (ContaineronShip.class) == null)
        {stopmoveRight();}
        if (getY()<563 && getOneIntersectingObject (ContaineronShip.class) == null)
        {getWorld().addObject(new Container1(), getX(), getY());
         Scene.addObject(new AIHook(), getX(), getY());
         Scene.removeObject(this);
        }
        else if (getY() <390 && getOneIntersectingObject (ContaineronShip.class) != null)
        {setmoveRight();}
    }    
}
