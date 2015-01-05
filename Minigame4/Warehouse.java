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
        addObject (new Player(), 100, 570);
        addObject (new containerSide(), 442, 562);
        addObject (new containerSide2(), 200,572);
        addObject (new containerSide3(), 650,553);
        addObject (new crate(), 233,515);
        addObject (new radioactiveBarrel(), 700,485);
    }
}
