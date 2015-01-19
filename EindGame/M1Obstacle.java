import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class M1Obstacle extends Actor
{
    // Class which contains all 3 "Obstacle" classes.
    
    private Game1 Scene;
    public static int time = 5;  
    public static int count = 60;
    public static int Speed = 2;
    
    protected void addedToWorld(World world) 
    {
       Scene = (Game1) world; 
    } 
    // Resets timer and MovementSpeed of the obstacles.
    protected static void Reset()   
    {
       ResetSpeed();
       ResetTimer();
       ResetCount();
       M1Rock.ResetSpeed();
       M1Buoy.ResetSpeed();
    }
    // Increases speed when timer is 0.
    public void act()
    {
       if(counter())  
       {  
           time--;  
           count = 60;  
       } 
       if (time == 0 && Speed != 10)
       {
           M1Rock.IncreaseSpeed();
           M1Buoy.IncreaseSpeed();
           IncreaseSpeed();
           ((Game1) this.getWorld()).IncreaseBGSpeed();
           time = 5;
       } 
    }
    // Makes the obstacles move down the screen.
    protected void ObstacleMove(int Obstaclespeed)
    {
        setLocation(getX(), getY() + Obstaclespeed); 
        if (getY()>595)
        {  
            getWorld().removeObject(this);  
        }
    }      
    private boolean counter()  
    {  
        if(count > 0)  
        {  
            count--;  
        }  
        return count == 0;  
    }
    // Increases speed.
    private static int IncreaseSpeed()
    {      
        Speed = Speed+1;
        return Speed;
    }
    // Sets speed back to 2.
    protected static int ResetSpeed()
    {      
        Speed = 2;
        return Speed;
    }
    // Sets timer back to 5.
    protected static int ResetTimer()
    {
        time = 5;
        return time;
    }
    // Sets the count back to 60.
    protected static int ResetCount()
    {      
        count = 60;
        return count;
    }
}
