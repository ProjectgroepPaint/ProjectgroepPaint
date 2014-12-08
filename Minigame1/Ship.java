import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;

/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship extends Actor
{
    /** Ship speed */
    private int speed = 8;

    
    /**
     * Act - do whatever the Ship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
                if (Greenfoot.isKeyDown("left"))
        {
            move (-speed); 
            turn(3);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move (speed); 
        }
        setRotation(90);  
        if (Greenfoot.isKeyDown("up"))  
        { move(-4); }  
        if (Greenfoot.isKeyDown("down"))  
        { move(4); }  
        setRotation(0);
        
        if (getOneIntersectingObject (Rock.class) != null){
            World myWorld = getWorld();
            myWorld.removeObject(this);
            GameOver gameover= new GameOver();
            myWorld.addObject (gameover,myWorld.getWidth()/2, myWorld.getHeight()/2);
        }
        else if (getOneIntersectingObject (Land.class) != null){
            World myWorld = getWorld();
            myWorld.removeObject(this);
            GameOver gameover= new GameOver();
            myWorld.addObject (gameover,myWorld.getWidth()/2, myWorld.getHeight()/2);
        }

    }
    
    public void hitRock()
    {
    Actor Rock=getOneIntersectingObject(Rock.class);
    if(Rock!= null)
    {
    World myWorld = getWorld();
    myWorld.removeObject(this);
    GameOver gameover= new GameOver();
    myWorld.addObject (gameover,myWorld.getWidth()/2, myWorld.getHeight()/2);
    }
    
    }
}
