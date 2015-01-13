import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)  
import java.awt.Color;  
      
public class Timer extends Actor  
{  
    private int time = 90;  
    private int count = 60;  
    public void act()   
    {
        if(time == 0)  
        {  
            finish Finish = new finish();
            getWorld().addObject(Finish, 400, 300);
            World myWorld = getWorld();
            getWorld().removeObjects(getObjectsInRange(1000, Ship.class));
            myWorld.removeObject(this);
        }  
        if(counter())  
        {  
            time--;  
            count = 60;  
        }  
        display();  
    }      
    private boolean counter()  
    {  
        if(count > 0)  
        {  
            count--;  
        }  
        return count == 0;  
    }  
    private void display()  
    {  
        setImage(new GreenfootImage("Time left: " + time, 30, Color.RED, new Color(0, 0, 0, 0)));    
    }  
    public void setTime()  
    {  
        time = 190;  
    }  
    public boolean isTimeUp()  
    {  
        return time == 0;  
    }  
}  