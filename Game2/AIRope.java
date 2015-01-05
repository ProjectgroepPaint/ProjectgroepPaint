import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AIRope extends AICrane
{
    public int minimum_offset = 933;
    public int maximum_offset = 1250;
    public static int VERTICAL_MOVEMENT;
    public void act()
    {
        AICrane.getmoveRight();
        AIHook.getVERTICAL_MOVEMENT();
        AIHookwithcontainer.getVERTICAL_MOVEMENT();
        Ropemove();
    }
    public void Ropemove() 
    {
       if(getX() > minimum_offset && moveLeft == true)
       {CranemoveAI(-velocity);}
       else if (getX() < maximum_offset && moveRight == true)
       {CranemoveAI(velocity);}
        
       // Method call to force the rope to stay vertical
       setRotation(90);
  
       if (Greenfoot.isKeyDown("W"))  
       {move(-VERTICAL_MOVEMENT);}
       
       {setLocation(getX(), getY() + VERTICAL_MOVEMENT);}
        
       // Method call to force the rope to stay vertical
       setRotation(0);
    }
}