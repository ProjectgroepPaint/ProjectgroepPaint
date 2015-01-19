import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Container3 extends FallingContainers
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
            Scene.addObject(new ContaineronShip3(), getX(), getY());
            
            // Adds points to score.
            if (getX()<700)
            {
                ((Game2) this.getWorld()).addScore(-30);
            }
            else
            {
                ((Game2) this.getWorld()).addScore2(-30);
            }
            Scene.removeObject(this);
        } 
    }
}
