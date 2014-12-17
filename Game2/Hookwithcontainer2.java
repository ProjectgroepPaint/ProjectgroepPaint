import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hookwithcontainer2 extends Hook2
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
        if (Greenfoot.isKeyDown("A") && getX()>933)
        {move (-speed); turn(3);}

        if (Greenfoot.isKeyDown("D") && getX()<1250)
        {move (speed);}

        setRotation(90);

  
        if (Greenfoot.isKeyDown("W")&& getY()>345) 
        {move(-4);}
  
        if (Greenfoot.isKeyDown("S"))  
        {move(4);}
  
        setRotation(0);
        if (getY()<563 && Greenfoot.isKeyDown("Q") && getOneIntersectingObject (ContaineronShip.class) == null)
        {getWorld().addObject(container, getX(), getY());
         background.addObject(new Hook2(), getX(), getY());
         background.removeObject(this);
        }
    }    
}
