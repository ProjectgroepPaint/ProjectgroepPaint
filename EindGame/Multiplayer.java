import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Multiplayer extends Game2
{
    public Multiplayer()
    {
        // Adding Player2Crane and hook to the world.
        addObject(new Crane2(), 897, 446);
        addObject(new Rope2(), 1007, 333);
        addObject(new Hook2(), 994, 672);
    }
}
