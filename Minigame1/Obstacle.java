import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Obstacle extends Actor
{
    private Game1 Scene;
    public int time = 5;  
    public int count = 60;
    public static int Speed = 2;
    public void addedToWorld(World world) 
    {
       Scene = (Game1) world; 
    } 
    public void act()   
    {
       if(counter())  
       {  
           time--;  
           count = 60;  
       } 
       if (time == 0 && Speed != 12)
       {
           Rock.IncreaseSpeed();
           Buoy.IncreaseSpeed();
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
}
