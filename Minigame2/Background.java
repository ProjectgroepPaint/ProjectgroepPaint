import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world subclass for the background and actors.
 */
public class Background extends World
{

    /**
     * Constructor for objects of class Port.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 1000, 1);
        // Create new Ships to load containers on to.
        addObject(new Ship(), 437, 497);
        addObject(new Ship2(), 1077, 497);
        // Create new Crane to load containers from Wharf to Ship.
        addObject(new Crane(), 185, 488);
        addObject(new Crane(), 871, 482);
        // Create container to be shipped from Wharf to Ship.
        addObject(new Container(), 10, 10);
        // Create the Wharfs on which the Containers will be stacked.
        addObject(new Wharf(), 10, 10);
        addObject(new Wharf2(), 10, 10);
    }
    
}
