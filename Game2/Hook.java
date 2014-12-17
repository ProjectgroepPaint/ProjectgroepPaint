import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hook extends Rope
{
    private int speed = 8;
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

  
        if (Greenfoot.isKeyDown("up")&& getY()>325)  
        {move(-4);}
  
        if (Greenfoot.isKeyDown("down"))  
        {move(4);}
  
        setRotation(0);
        
        
        if (Greenfoot.isKeyDown("space") && getOneIntersectingObject (Container.class) != null)
        {
            background.addObject(new Hookwithcontainer(), getX(), getY());
            getWorld().removeObjects(getObjectsInRange(50, Container.class));
            background.removeObject(this);
            
        }
        else if (Greenfoot.isKeyDown("space") && getOneIntersectingObject (ContainerBig.class) != null)
        {
            background.addObject(new Hookwithbigcontainer(), getX(), getY());
            getWorld().removeObjects(getObjectsInRange(80, ContainerBig.class));
            background.removeObject(this);
            
        } 
    }
}