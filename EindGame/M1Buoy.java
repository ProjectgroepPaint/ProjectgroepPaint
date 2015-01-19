import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class M1Buoy extends M1Obstacle
{
    public static int Obstaclespeed = 2;
    public void act() 
    {
        // Calls method to make the obstacle move.
        ObstacleMove(Obstaclespeed);
    }
    // Increases speed of buoy.
    public static int IncreaseSpeed()
    {      
        Obstaclespeed = Obstaclespeed+1;
        return Obstaclespeed;
    }
    // Sets speed of buoy back to 2.
    public static int ResetSpeed()
    {      
        Obstaclespeed = 2;
        return Obstaclespeed;
    }
}
