import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**Speed of Player*/
    private int speed = 5;
    private int ySpeed;
    private int apexTimer;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if (Greenfoot.isKeyDown("left"))
        {
            move (-speed);
            setImage("m4player-left.png");
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move (speed); 
            setImage("m4player.png");
        }
        
        int groundLevel = getWorld().getHeight() - getImage().getHeight()/2;
        boolean onGround = (getY() == groundLevel);
        if (!onGround) 
        {
            if (ySpeed == 0 && apexTimer > 0) apexTimer--; 
            if (ySpeed == 0 && apexTimer > 0) return; 
            ySpeed++; 
            setLocation(getX(), getY()+ySpeed); 
            if (getY()>=groundLevel) 
            {
                setLocation(getX(), groundLevel); 
                Greenfoot.getKey(); 
           }
        }
        else 
        {
            if ("space".equals(Greenfoot.getKey()))
            {
                ySpeed = -15; 
                setLocation(getX(), getY()+ySpeed); 
                apexTimer = 5;  
            }
        }
    
    }
    
    
}
