import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)  
import java.awt.Color;     
      
public class TimerGame2 extends Actor  
{  
       private int time = 60;
       // Total amount of gametime.
       private int count = 60;
       
       public void act()   
       {  
           if(time == 0)  
           {  
               World myWorld = getWorld();
               ((Game2) this.getWorld()).End(1);
               myWorld.removeObject(this);
               // Removes the timer when time is up.
           }  
           if(counter())  
           {  
             time--;
             // Decreases the time on the timer.
             
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
           // Displays the timer.
       }
}  
