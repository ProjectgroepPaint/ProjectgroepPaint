import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rock extends Obstacle
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
}
