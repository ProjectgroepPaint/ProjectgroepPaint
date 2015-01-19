import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Container1 extends FallingContainers
{
    private Game2 Scene;
    
    public void addedToWorld(World world) 
    {
       Scene = (Game2) world; 
    }    
    public void act() 
    {
        // Calls method which makes the container move (fall).
        Fallingcontainer();        
        if (getY()>563 || getOneIntersectingObject (ContaineronShip.class) != null)
        {  
            Scene.addObject(new ContaineronShip1(), getX(), getY());
            
            // Adds points to score.
            if (getX()<700)
            {
                ((Game2) this.getWorld()).addScore(20);
            }
            else
            {
                ((Game2) this.getWorld()).addScore2(20);
            }
            Scene.removeObject(this);
        } 
    }
}
