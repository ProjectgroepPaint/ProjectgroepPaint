import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Container2 extends FallingContainers
{
    private Game2 Scene;
    
    protected void addedToWorld(World world) 
    {
       Scene = (Game2) world; 
    }    
    public void act() 
    {
        // Calls method which makes the container move (fall).
        Fallingcontainer();
        
        if (getY()>563 || getOneIntersectingObject (ContaineronShip.class) != null)
        {  
            Scene.addObject(new ContaineronShip2(), getX(), getY());
            
            // Adds points to score.
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
