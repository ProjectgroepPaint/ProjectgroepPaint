import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rock extends Actor
{


public void act() 
{
setLocation(getX(), getY() + 5); 
if (getY()>595){  
          getWorld().removeObject(this);  
   };
} 
}
