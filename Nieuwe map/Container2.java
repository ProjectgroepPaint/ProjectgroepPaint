import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Container2 extends FallingContainers
{
    private Background Scene;
    
    public void addedToWorld(World world) 
    {
       Scene = (Background) world; 
    }    
    public void act() 
    {
        Fallingcontainer();
        if (getY()>563 || getOneIntersectingObject (ContaineronShip.class) != null)
        {  
            Scene.addObject(new ContaineronShip2(), getX(), getY());
            
            if (getX()<700)
            {
                ((Background) this.getWorld()).addScore(40);
            }
            else
            {
                ((Background) this.getWorld()).addScore2(40);
            }
            Scene.removeObject(this);
        } 
    }
}