    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)  
    import java.awt.Color;  
      
    public class Timer extends Actor  
    {  
        /** 
         * Act - do whatever the Timer wants to do. This method is called whenever 
         * the 'Act' or 'Run' button gets pressed in the environment. 
         */  
        private int time = 180;  
        private int count = 65;  
        public void act()   
        {  
            // Add your action code here.  
            if(time == 0)  
            {  
                return;  
            }  
              
            if(counter())  
            {  
                time--;  
                count = 65;  
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
