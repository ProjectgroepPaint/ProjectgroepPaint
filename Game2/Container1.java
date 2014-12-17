import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Container1 extends FallingContainers
{
    private Background background;
    
    public void addedToWorld(World world) 
    {
       background = (Background) world; 
    }    
    public void act() 
    {
        setLocation(getX(), getY() + 2);
        if (getY()>563 && getX()<699||getOneIntersectingObject (ContaineronShip.class) != null && getX()<700)
        {  
            background.addObject(new ContaineronShip1(), getX(), getY());
            ((Background) this.getWorld()).addScore(10);
            background.removeObject(this); 
        }
        else if (getY()>563 && getX()>700||getOneIntersectingObject (ContaineronShip.class) != null && getX()>700)
        {  
            background.addObject(new ContaineronShip1(), getX(), getY());
            ((Background) this.getWorld()).addScore2(10);
            background.removeObject(this);
        }
    }
}
