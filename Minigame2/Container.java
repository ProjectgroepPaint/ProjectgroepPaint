import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Container extends Actor
{
    private Background background;

    public void addedToWorld(World world) 
    {
       background = (Background) world; 
    }
    public void act() 
    {
        setLocation(getX() +2, getY());
        if (Greenfoot.isKeyDown("space") && getOneIntersectingObject (Rope.class) != null)
        {

            background.removeObject(this);
        } 
    }
}
