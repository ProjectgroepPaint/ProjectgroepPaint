import greenfoot.*;
import java.awt.Color;
 
public class Rope extends Actor
{
    Actor actorOne;
    Actor actorTwo;
     
    public Rope(Actor Ship, Actor Ship2)
    {
        actorOne = Ship;
        actorTwo = Ship2;
    }
     
    public void addedToWorld(World world)
    {
        updateImage();
    }
     
    private void updateImage()
    {
        Actor ship = (Actor)getWorld().getObjects(Ship.class).get(0);
        Actor ship2 = (Actor)getWorld().getObjects(Ship2.class).get(0);
        
        int ropeLength = (int) Math.hypot(ship2.getX()-ship.getX(), ship2.getY()-ship.getY());
        GreenfootImage image = new GreenfootImage(ropeLength, 5);
        image.setColor(new Color(96, 24, 24));
        image.fill();
        setImage(image);
        setLocation((ship.getX()+ship2.getX())/2, (ship.getY()+25+ship2.getY())/2);
        turnTowards(ship2.getX(), ship2.getY());        
    }
     
    public void act()
    {
        updateImage();
    }
}