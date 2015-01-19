import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class StartScreen extends World
{
    public StartScreen()
    {
        super(1920, 1080, 1);
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new Menu());
        }
    }
}
