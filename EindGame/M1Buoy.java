import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class M1Buoy extends M1Obstacle
{
    public static int Obstaclespeed = 2;
    public void act() 
    {
        ObstacleMove(Obstaclespeed);
    }
    public static int IncreaseSpeed()
    {      
        Obstaclespeed = Obstaclespeed+1;
        return Obstaclespeed;
    }
    public static int ResetSpeed()
    {      
        Obstaclespeed = 2;
        return Obstaclespeed;
    }
}
