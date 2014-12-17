import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Container2 extends FallingContainers
{
    private Background background;
    
    public void addedToWorld(World world) 
    {
       background = (Background) world; 
    }    
    public void act() 
    {
        setLocation(getX(), getY() + 2);
        if (getY()>563||getOneIntersectingObject (ContaineronShip.class) != null)
        {  
            background.addObject(new ContaineronShip2(), getX(), getY());
            
            if (getX()<700)
            {
                ((Background) this.getWorld()).addScore(20);
            }
            else
            {
                ((Background) this.getWorld()).addScore2(20);
            }
            background.removeObject(this);
        } 
    }
}
