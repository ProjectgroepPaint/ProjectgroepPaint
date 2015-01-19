import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Container4 extends FallingContainers
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
            Scene.addObject(new ContaineronShip4(), getX(), getY());
            
            // Adds or removes points to score.
            if (getX()<700)
            {
                if (Math.random() > 0.6){
                    ((Game2) this.getWorld()).addScore(50);
                } else {
                    ((Game2) this.getWorld()).addScore(-50);
                }
            }
            else
            {
                if (Math.random() > 0.6){
                    ((Game2) this.getWorld()).addScore2(50);
                } else {
                    ((Game2) this.getWorld()).addScore2(-50);
                }
            }
            Scene.removeObject(this);
        } 
    }
}
