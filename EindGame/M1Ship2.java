import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class M1Ship2 extends M1Ship
{
   private int speed = 5;
   public void act() 
   {
     Collision();
     Shipmove2();
   }
   private void Shipmove2()
   {
     // Moves Ship2 (the big ship) to the left or right if Ship1 isn't right in front of it.
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
