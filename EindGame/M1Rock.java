import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class M1Rock extends M1Obstacle
{
    protected static int Obstaclespeed = 2;
    public void act() 
    {
        // Calls method to make the obstacle move.
        ObstacleMove(Obstaclespeed);
    }
    // Increases speed of rock.
    protected static int IncreaseSpeed()
    {      
        Obstaclespeed = Obstaclespeed+1;
        return Obstaclespeed;
    }
    // Sets speed of rock back to 2.
    protected static int ResetSpeed()
    {      
        Obstaclespeed = 2;
        return Obstaclespeed;
    }
}
