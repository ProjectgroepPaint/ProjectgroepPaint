import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hook2 extends Rope2
{
    private int speed = 8;
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

  
        if (Greenfoot.isKeyDown("W")&& getY()>325)  
        {move(-4);}
  
        if (Greenfoot.isKeyDown("S"))  
        {move(4);}
  
        setRotation(0);
        
        
        if (Greenfoot.isKeyDown("Q") && getOneIntersectingObject (Container.class) != null)
        {
            background.addObject(new Hookwithcontainer2(), getX(), getY());
            getWorld().removeObjects(getObjectsInRange(50, Container.class));
            background.removeObject(this);
            
        }
        else if (Greenfoot.isKeyDown("Q") && getOneIntersectingObject (ContainerBig.class) != null)
        {
            background.addObject(new Hookwithbigcontainer2(), getX(), getY());
            getWorld().removeObjects(getObjectsInRange(80, ContainerBig.class));
            background.removeObject(this);
            
        } 
    }
}