import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class M1Ship2 extends M1Ship
{
   private int speed = 5;
   public void act() 
   {
     Collision();
     Shipmove2();
   }
   public void Shipmove2()
   {
     if(!getWorld().getObjects(M1Ship.class).isEmpty())
     {
         Actor ship = (Actor)getWorld().getObjects(M1Ship.class).get(0);
         if (ship.getX() < getX()-5)
            {
                move (-speed);
            }
            else if (ship.getX() > getX()+5)
            {
                move (speed);
            }
     }
   }
}
