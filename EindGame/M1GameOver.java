import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class M1GameOver extends Actor
{
    public void act() 
    {
        // Gameover Image.

        getWorld().removeObjects(getObjectsInRange(1000, M1Ship.class));
        getWorld().removeObjects(getObjectsInRange(1000, M1Rope.class));
        // removes the player (actor ships) and the rope between the ships.
    }    
}
