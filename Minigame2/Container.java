import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Container extends Actor
{
    private Background background;
    public int time; 

    public void addedToWorld(World world) 
    {
       background = (Background) world; 
    }
    public void act() 
    {
        setLocation(getX() +2, getY());
        if (time>0)
        {
            time--; 
        }
        if (Greenfoot.isKeyDown("space") && getOneIntersectingObject (Rope.class) != null)
        {
            time=2;
            return;
            if (time==0)
            {
                background.removeObject(this);
            }
        } 
    }
}
