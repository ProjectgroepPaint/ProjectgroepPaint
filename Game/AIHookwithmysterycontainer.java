import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AIHookwithmysterycontainer extends AIHook
{
    private Game2 Scene;
    private void setVERTICAL_MOVEMENT()
    {
        // Moves hook up.
        if (getY()>340)
        {VERTICAL_MOVEMENT = -6;}
        else {VERTICAL_MOVEMENT = 0;}
    }
    protected static int getVERTICAL_MOVEMENT()
    {
        return VERTICAL_MOVEMENT;
    } 
    protected void addedToWorld(World world) 
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
         // Spawns container on ship if possible.
        if (getY()<563 && getOneIntersectingObject (ContaineronShip.class) == null)
        {getWorld().addObject(new Container4(), getX(), getY());
         Scene.addObject(new AIHook(), getX(), getY());
         Scene.removeObject(this);
        }
        // If necessary starts moving the crane again.
        else if (getY() <350 && getOneIntersectingObject (ContaineronShip.class) != null)
        {setmoveRight();}
    }    
}
