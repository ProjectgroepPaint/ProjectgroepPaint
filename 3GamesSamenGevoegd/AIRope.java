import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AIRope extends AICrane
{
    public int minimum_offsetRope = 946;
    public int maximum_offsetRope = 1263;
    public int minimum_offsetHook = 933;
    public int maximum_offsetHook = 1250;
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
       if(getX() > minimum_offsetRope && moveLeft == true)
       {CranemoveAI(-velocity);}
       else if (getX() < maximum_offsetRope && moveRight == true)
       {CranemoveAI(velocity);}
        
       // Method call to force the rope to stay vertical
       setRotation(90);
  
       
       
       {setLocation(getX(), getY() + VERTICAL_MOVEMENT);}
        
       // Method call to force the rope to stay vertical
       setRotation(0);
    }
    public void Hookmove() 
    {
       if(getX() > minimum_offsetHook && moveLeft == true)
       {CranemoveAI(-velocity);}
       else if (getX() < maximum_offsetHook && moveRight == true)
       {CranemoveAI(velocity);}
        
       // Method call to force the rope to stay vertical
       setRotation(90);
  
       
       
       {setLocation(getX(), getY() + VERTICAL_MOVEMENT);}
        
       // Method call to force the rope to stay vertical
       setRotation(0);
    }
}
