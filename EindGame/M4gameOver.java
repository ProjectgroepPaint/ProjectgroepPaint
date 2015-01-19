import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class M4gameOver extends Actor
{
    // Gameover image.
    
    
    
    public void act() 
    {
        restart();
    }
    
    // Restarts level if "r" is pressed.
    public void restart() {
        if (Greenfoot.isKeyDown("r") && (M4Level01.class.isInstance(getWorld())))
            {
                Greenfoot.setWorld(new M4Level01());  
            }  
        else if (Greenfoot.isKeyDown("r") && (M4Level02.class.isInstance(getWorld())))
            {
                Greenfoot.setWorld(new M4Level02());  
            }
        else if (Greenfoot.isKeyDown("r") && (M4Level03.class.isInstance(getWorld())))
            {
                Greenfoot.setWorld(new M4Level03());  
            }
        else if (Greenfoot.isKeyDown("r") && (M4Level04.class.isInstance(getWorld())))
            {
                Greenfoot.setWorld(new M4Level04());  
            }
        else if (Greenfoot.isKeyDown("r") && (M4Level05.class.isInstance(getWorld())))
            {
                Greenfoot.setWorld(new M4Level05());  
            }
    }
}
