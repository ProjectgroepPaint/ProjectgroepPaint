import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class M1Obstacle extends Actor
{
    private Game1 Scene;
    public static int time = 5;  
    public static int count = 60;
    public static int Speed = 2;
    public void addedToWorld(World world) 
    {
       Scene = (Game1) world; 
    } 
    public static void Reset()   
    {
       ResetSpeed();
       ResetTimer();
       ResetCount();
       M1Rock.ResetSpeed();
       M1Buoy.ResetSpeed();
    }
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
    public void ObstacleMove(int Obstaclespeed)
    {
        setLocation(getX(), getY() + Obstaclespeed); 
        if (getY()>595)
        {  
            getWorld().removeObject(this);  
        }
    }      
    public boolean counter()  
    {  
        if(count > 0)  
        {  
            count--;  
        }  
        return count == 0;  
    }
    public static int IncreaseSpeed()
    {      
        Speed = Speed+1;
        return Speed;
    }
    public static int ResetSpeed()
    {      
        Speed = 2;
        return Speed;
    }
    public static int ResetTimer()
    {
        time = 5;
        return time;
    }
    public static int ResetCount()
    {      
        count = 60;
        return count;
    }
}
