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
           // Removes instructions for player1 after 10 seconds.
           if(time == 50 && getWorld().getObjects(InstructionsM2P1.class).size() != 0)
           {
               
               Actor Instructions = (Actor)getWorld().getObjects(InstructionsM2P1.class).get(0);
               getWorld().removeObject(Instructions);
           }
           // Removes instructions for player2 after 10 seconds.
           if(time == 50 && getWorld().getObjects(InstructionsM2P2.class).size() != 0)
           {
               // Removes instructions for player1.
               Actor Instructions2 = (Actor)getWorld().getObjects(InstructionsM2P2.class).get(0);
               getWorld().removeObject(Instructions2);
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
