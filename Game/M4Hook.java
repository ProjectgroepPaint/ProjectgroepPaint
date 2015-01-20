import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class M4Hook extends Actor
{
   private int speed = 1;
   
   public void act() 
   {
        move();
        checkLevel();
   }    
   
   // Automatically moves the hook to the right
   private void move() 
   {
          setLocation(getX()+speed, getY());
   }
   
   // Sets the speed of the hook to a higher number when the current level is 4 or 5
   private void checkLevel() {
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
