import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Obstacle extends Actor
{
    public int time = 5;  
    public int count = 60;
    public void act()   
    {
       if(counter())  
       {  
           time--;  
           count = 60;  
       } 
       if (time == 0)
       {
           Rock.Setspeed();
           Buoy.Setspeed();
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
}
