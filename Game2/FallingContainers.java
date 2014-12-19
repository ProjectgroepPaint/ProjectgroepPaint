import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FallingContainers extends Actor
{
    public final int Fallingspeed = 2;
    public void Fallingcontainer() 
    {
        setLocation(getX(), getY() + Fallingspeed);
    }    
}
