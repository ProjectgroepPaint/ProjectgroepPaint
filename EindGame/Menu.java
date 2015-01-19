import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Menu extends World
{
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        addObject(new button1(), 250, 200);
        addObject(new button2(), 750, 200);
        addObject(new button3(), 250, 600);
        addObject(new button4(), 750, 600);
        addObject(new button6(), 608, 365);
    }
}
