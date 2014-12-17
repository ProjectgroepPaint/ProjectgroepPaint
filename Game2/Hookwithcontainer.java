import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hookwithcontainer extends Hook
{
    private int speed = 8;
    Container1 container = new Container1();
    private Background background;
    
    public void addedToWorld(World world) 
    {
       background = (Background) world; 
    }
    public void act() 
    {
        if (Greenfoot.isKeyDown("left") && getX()>209)
        {move (-speed); turn(3);}

        if (Greenfoot.isKeyDown("right") && getX()<526)
        {move (speed);}

        setRotation(90);

  
        if (Greenfoot.isKeyDown("up")&& getY()>345) 
        {move(-4);}
  
        if (Greenfoot.isKeyDown("down"))  
        {move(4);}
  
        setRotation(0);
        if (getY()<563 && Greenfoot.isKeyDown("space") && getOneIntersectingObject (ContaineronShip.class) == null)
        {getWorld().addObject(container, getX(), getY());
         background.addObject(new Hook(), getX(), getY());
         background.removeObject(this);
        }
    }    
}
