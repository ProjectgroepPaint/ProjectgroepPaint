import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Game1 extends World
{
    private GreenfootImage bgImage = new GreenfootImage("water-background.jpg");  
    private int scrollAmount;
    private int actCount = 0;
    private static int BackgroundSpeed = 2;
 
    public Game1()
    { 
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800,600, 1);
        
        // Adds the 2 ships to the world.
        addObject (new M1Ship(), 387 , 475);
        addObject (new M1Ship2(), 387, 576);
        
        // Adds land on both sides of the world.
        addObject (new M1Land(), 20, 300);
        addObject (new M1Land(), 780, 300);
        
        // Adds the Timer and the ObstacleTimer to the world.
        addObject (new M1Timer(), 400, 100);
        addObject (new M1Obstacle(), 0, 0);
        
        // Adding button to return to the menu the world.
        addObject(new button5(), 30, 568);
        
        // Adds a rope between 2 actors (the ships).
        Actor ship = (Actor)this.getObjects(M1Ship.class).get(0);
        Actor ship2 = (Actor)this.getObjects(M1Ship2.class).get(0);
        M1Rope rope = new M1Rope(ship, ship2);
        this.addObject(rope, 1, 1);
        
        // Sets which class shows on top.
        setPaintOrder(button5.class,M1GameOver.class,M1finish.class,M1Timer.class,M1Ship.class,M1Rope.class,M1Land.class,M1Obstacle.class);
    }
    public void act() 
    {
        // Sets the movement speed of the background.
        scrollAmount = (scrollAmount+BackgroundSpeed)%bgImage.getHeight();  
        
        if (scrollAmount < getHeight())
        {
            getBackground().drawImage(bgImage, 0, scrollAmount-bgImage.getHeight());
            getBackground().drawImage(bgImage, 0, scrollAmount-0*bgImage.getHeight());
        }  
        
        // Resets the Game.
        if (Greenfoot.isKeyDown("space"))
        {
            M1Obstacle.Reset();
            ResetBGSpeed();
            Greenfoot.setWorld(new Game1());
        }
        
        // Checks if enough time has passed to spawn a new Rock or Buoy.
        if (actCount > 0)
        {
            actCount--;
        } else {
                    if (Math.random() > 0.5)
                    {
                        addObject(new M1Rock(), Greenfoot.getRandomNumber(300)+100, 0);
                    } else {
                        addObject(new M1Buoy(), Greenfoot.getRandomNumber(300)+100, 0);
                    }
                    if (Math.random() > 0.5)
                    {
                        addObject(new M1Rock(), Greenfoot.getRandomNumber(200)+450, 0);
                    } else {
                        addObject(new M1Buoy(), Greenfoot.getRandomNumber(200)+450, 0);
                    }
                    actCount = 130;
        }
    }
    
    // Method which increases the BackgroundSpeed.
    protected void IncreaseBGSpeed()
    {
        this.BackgroundSpeed = BackgroundSpeed + 1;
    }
    
    // Method which sets the BackgroundSpeed back to 2.
    protected static void ResetBGSpeed()
    {      
        BackgroundSpeed = 2;
    }
}