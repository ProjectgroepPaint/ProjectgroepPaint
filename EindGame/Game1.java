import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Game1 extends World
{
    private GreenfootImage bgImage = new GreenfootImage("water-background.jpg");  
    private int scrollAmount;
    private int actCount = 0;
    private static int BackgroundSpeed = 2;
 
    public Game1()
    { 
        super(800,600, 1);
        addObject (new M1Ship(), 387 , 475);
        addObject (new M1Ship2(), 387, 576);
        addObject (new M1Land(), 20, 300);
        addObject (new M1Land(), 780, 300);
        addObject (new M1Timer(), 400, 100);
        addObject (new M1Obstacle(), 0, 0);
        addObject(new button5(), 30, 568);
        
        Actor ship = (Actor)this.getObjects(M1Ship.class).get(0);
        Actor ship2 = (Actor)this.getObjects(M1Ship2.class).get(0);
        M1Rope rope = new M1Rope(ship, ship2);
        this.addObject(rope, 1, 1);
        
        setPaintOrder(button5.class,M1GameOver.class,M1finish.class,M1Timer.class,M1Ship.class,M1Rope.class,M1Land.class,M1Obstacle.class);
    }
    public void act() 
    {
        scrollAmount = (scrollAmount+BackgroundSpeed)%bgImage.getHeight();  
        
        if (scrollAmount < getHeight())
        {
            getBackground().drawImage(bgImage, 0, scrollAmount-bgImage.getHeight());
            getBackground().drawImage(bgImage, 0, scrollAmount-0*bgImage.getHeight());
        }  
        
        if (Greenfoot.isKeyDown("space"))
        {
            M1Obstacle.Reset();
            ResetBGSpeed();
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
    public void IncreaseBGSpeed()
    {
        this.BackgroundSpeed = BackgroundSpeed + 1;
    }
    public static void ResetBGSpeed()
    {      
        BackgroundSpeed = 2;
    }
}