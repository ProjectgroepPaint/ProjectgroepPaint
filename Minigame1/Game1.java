import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Game1 extends World
{
    private GreenfootImage bgImage = new GreenfootImage("water-background.jpg");  
    private int scrollAmount;
    private int actCount = 0;
 
    public Game1()
    { 
        super(800,600, 1);
        addObject (new Ship(), 387 , 478);
        addObject (new Ship2(), 387, 569);
        addObject (new Land(), 20, 300);
        addObject (new Land(), 780, 300);
        addObject (new Timer(), 400, 100);
        addObject (new Obstacle(), 0, 0);
        setPaintOrder(GameOver.class,finish.class,Timer.class,Ship.class,Land.class,Obstacle.class);
    }

    public void act() 
    {
        scrollAmount = (scrollAmount+1)%bgImage.getHeight();  
        
        if (scrollAmount < getHeight())
        {
            getBackground().drawImage(bgImage, 0, scrollAmount-bgImage.getHeight());
            getBackground().drawImage(bgImage, 0, scrollAmount-0*bgImage.getHeight());
        }  
        
        if (Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new Game1());  
        }
        if (Greenfoot.isKeyDown("p"))
        {
            Greenfoot.stop();  
        }
        if (actCount > 0)
        {
            actCount--;
        } else {
                    if (Math.random() > 0.5)
                    {
                        addObject(new Rock(), Greenfoot.getRandomNumber(600)+100, 0);
                    } else {
                        addObject(new Buoy(), Greenfoot.getRandomNumber(600)+100, 0);
                    }
                    actCount = 150;
        }
    }
}