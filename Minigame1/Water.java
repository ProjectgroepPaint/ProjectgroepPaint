import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Water extends World
{
private GreenfootImage bgImage = new GreenfootImage("water-background.jpg");  
private int scrollAmount; 
 
public Water()
{ 
super(800,600, 1);
 
addObject (new Ship(), 300, 300);
addObject (new Land(), 20, 300);
addObject (new Land(), 780, 300);

}

public void act() 
{
scrollAmount = (scrollAmount+1)%bgImage.getHeight();  
if (scrollAmount < getHeight()) getBackground().drawImage(bgImage, 0, scrollAmount-bgImage.getHeight());  
getBackground().drawImage(bgImage, 0, scrollAmount-0*bgImage.getHeight());
if(Greenfoot.getRandomNumber(200) < 1) {
addObject(new Rock(), Greenfoot.getRandomNumber(600)+100, 0); 
}
}
}