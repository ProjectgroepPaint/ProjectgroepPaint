import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Water here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Water extends World
{

    /**
     * Constructor for objects of class Water.
     * 
     */
public Water()
{ 
super(800,600, 1);
addObject (new Ship(), 300, 300);
addObject (new Land(), 20, 300);
addObject (new Land(), 780, 300);

}

/**
* Creates balloons at the bottom of the world.
*/
public void act() 
{
if(Greenfoot.getRandomNumber(500) < 2) {
addObject(new Rock(), Greenfoot.getRandomNumber(600)+100, 0); 
}
}
}
