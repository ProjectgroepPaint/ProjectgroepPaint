import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;


public class M1Ship extends Actor
{
   /** Ship speed */
   private int speed = 8;
   public void act() 
   {
       ShipMove(speed);
       Collision();
   }
   // Moves ship if buttons are pressed.
   private void ShipMove(int speed)
   {
       if (Greenfoot.isKeyDown("left"))
       {
           move (-speed);
       }
       if (Greenfoot.isKeyDown("right"))
       {
           move (speed); 
       } 
   }
   // Checks if the ships are colliding with an obstacle.
   protected void Collision()
   {
       Actor Rock=getOneIntersectingObject(M1Obstacle.class);
       if(Rock!= null)
       {
           World myWorld = getWorld();
           getWorld().removeObjects(getObjectsInRange(1000, M1Timer.class));
           M1GameOver gameover= new M1GameOver();
           myWorld.addObject (gameover,myWorld.getWidth()/2, myWorld.getHeight()/2);
       }    
   }
}
