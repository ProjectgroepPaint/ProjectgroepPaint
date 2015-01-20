import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FallingContainers extends Actor
{
    // Class which contains all 4 "FallingContainers" classes.
    
    protected final int Fallingspeed = 2;
    // Falling speed of containers.
    
    // Makes the containers fall down.
    protected void Fallingcontainer() 
    {
        setLocation(getX(), getY() + Fallingspeed);
    }    
}
