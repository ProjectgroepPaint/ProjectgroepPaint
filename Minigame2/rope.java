import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rope here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rope extends Actor
{
     private int speed = 8;
     private Background background;
    
    public void addedToWorld(World world) 
    {
       background = (Background) world; 
    }
    
    
    public void act() 
    {
        

  
        if (Greenfoot.isKeyDown("left"))
        {move (-speed); turn(3);}

        if (Greenfoot.isKeyDown("right"))
        {move (speed);}

        setRotation(90);

  
        if (Greenfoot.isKeyDown("up"))  
        {move(-4);}
  
        if (Greenfoot.isKeyDown("down"))  
        {move(4);}
  
        setRotation(0);
        
        
        if (getOneIntersectingObject (Container.class) != null)
        {
            background.addObject(new Ropewithcontainer(), getX(), getY());
            background.removeObject(this);
            
        } 
    }
}
