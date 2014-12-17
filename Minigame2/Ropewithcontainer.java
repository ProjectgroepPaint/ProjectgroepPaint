import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Haak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ropewithcontainer extends Actor
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
        if (Greenfoot.isKeyDown("left"))
        {move (-speed); turn(3);}

        if (Greenfoot.isKeyDown("right"))
        {move (speed);}

        setRotation(90);

  
        if (Greenfoot.isKeyDown("up"))  
        {move(-4);}
  
        if (Greenfoot.isKeyDown("down"))  
        {move(4);}
  
        setRotation(0);// Add your action code here.
        if (getY()<379 && Greenfoot.isKeyDown("space"))
        {getWorld().addObject(container, getX(), getY()+187);
         background.addObject(new Rope(), getX(), getY());
         background.removeObject(this);
        }
    }    
}
