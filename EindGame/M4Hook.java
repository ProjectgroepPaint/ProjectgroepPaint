import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class M4Hook extends Actor
{
   private int speed = 1;
   
   public void act() 
   {
        move();
        checkLevel();
   }    
   public void move() 
   {
          setLocation(getX()+speed, getY());
   }
   public void checkLevel() {
        if (M4Level04.class.isInstance(getWorld()))
        {
            speed = 2; 
        }
        else if (M4Level05.class.isInstance(getWorld()))
        {
            speed = 2; 
        }
   }
}