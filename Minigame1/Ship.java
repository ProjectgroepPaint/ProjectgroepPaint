import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;


public class Ship extends Actor
{
   /** Ship speed */
   private int speed = 8;
   public void act() 
   {
       ShipMove(speed);
       Collision();
   }
   public void ShipMove(int speed)
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
   public void Collision()
   {
       Actor Rock=getOneIntersectingObject(Obstacle.class);
       if(Rock!= null)
       {
           World myWorld = getWorld();
           getWorld().removeObjects(getObjectsInRange(1000, Timer.class));
           GameOver gameover= new GameOver();
           myWorld.addObject (gameover,myWorld.getWidth()/2, myWorld.getHeight()/2);
       }    
   }
}
