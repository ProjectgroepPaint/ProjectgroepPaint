import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Warhouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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
