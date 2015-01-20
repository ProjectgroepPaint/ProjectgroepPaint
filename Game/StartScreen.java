import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class StartScreen extends World
{
    public StartScreen()
    {
        // Create a new world with 1920x1080 cells with a cell size of 1x1 pixels.
        super(1900, 950, 1);
    }
    public void act()
    {
        // Sets world to menu.
        if (Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new Menu());
        }
    }
}
