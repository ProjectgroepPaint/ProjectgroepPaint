import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AIHookwithcontainer extends AIHook
{
    private Game2 Scene;
    public void setVERTICAL_MOVEMENT()
    {
        if (getY()>340)
        {VERTICAL_MOVEMENT = -6;}
        else {VERTICAL_MOVEMENT = 0;}
    }
    public static int getVERTICAL_MOVEMENT()
    {
        return VERTICAL_MOVEMENT;
    } 
    public void addedToWorld(World world) 
    {
       Scene = (Game2) world; 
    }
    public void act() 
    {
        setVERTICAL_MOVEMENT();
        AICrane.getmoveRight();
        AICrane.getmoveLeft();
        Hookmove();
        if (getY()<650 && getOneIntersectingObject (ContaineronShip.class) == null)
        {
            stopmoveRight();
            stopmoveLeft();
        }
        if (getY()<563 && getOneIntersectingObject (ContaineronShip.class) == null)
        {getWorld().addObject(new Container1(), getX(), getY());
         Scene.addObject(new AIHook(), getX(), getY());
         Scene.removeObject(this);
        }
        else if (getY() <350 && getOneIntersectingObject (ContaineronShip.class) != null)
        {setmoveRight();}
    }    
}
