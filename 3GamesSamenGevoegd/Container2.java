import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Container2 extends FallingContainers
{
    private Game2 Scene;
    
    public void addedToWorld(World world) 
    {
       Scene = (Game2) world; 
    }    
    public void act() 
    {
        Fallingcontainer();
        if (getY()>563 || getOneIntersectingObject (ContaineronShip.class) != null)
        {  
            Scene.addObject(new ContaineronShip2(), getX(), getY());
            
            if (getX()<700)
            {
                ((Game2) this.getWorld()).addScore(40);
            }
            else
            {
                ((Game2) this.getWorld()).addScore2(40);
            }
            Scene.removeObject(this);
        } 
    }
}
