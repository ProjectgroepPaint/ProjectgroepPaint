import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Warehouse extends World
{

    /**
     * Constructor for objects of class Warhouse.
     * 
     */
    public Warehouse()
    {    
        super(800, 600, 1); 
        addObject (new Player(), 100, 575);
    }
}
