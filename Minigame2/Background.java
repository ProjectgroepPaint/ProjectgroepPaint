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
        super(1500, 1000, 1);
        // Create new Ships to load containers on to.
        addObject(new Ship(), 1131, 468);
        addObject(new Ship2(), 407, 468);
        // Create new Crane to load containers from Wharf to Ship.
        addObject(new Crane(), 173, 446);
        addObject(new ComputerCrane(), 988, 446);
        addObject(new Rope(), 270, 472);
       
        // Create the Wharfs on which the Containers will be stacked.
        addObject(new Wharf(), 10, 10);
        addObject(new Wharf2(), 10, 10);
        
        setPaintOrder(Rope.class,Ropewithcontainer.class,Crane.class,Ship2.class,Container1.class);

    }
    public void act() 
    {
        if(Greenfoot.getRandomNumber(200) < 2)
        {
            addObject(new Container(), 0, 795);
        }
    }
}
