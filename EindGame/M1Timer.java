import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)  
import java.awt.Color;  
      
public class M1Timer extends Actor  
{  
    private int time = 90;  
    private int count = 60;  
    public void act()   
    {
        // Adds finish when time is up.
        if(time == 0)  
        {  
            M1finish Finish = new M1finish();
            getWorld().addObject(Finish, 400, 300);
            World myWorld = getWorld();
            getWorld().removeObjects(getObjectsInRange(1000, M1Ship.class));
            myWorld.removeObject(this);
        }  
        // Decreases time.
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
    // Displays time on screen.
    private void display()  
    {  
        setImage(new GreenfootImage("Time left: " + time, 30, Color.RED, new Color(0, 0, 0, 0)));    
    } 
}  