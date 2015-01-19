import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Game2 extends World
{
    private int actCount = 0;
    private int score = 0;
    private int score2 = 0;
    private int Time = 0;
    private int I = 0;
    public Game2()
    {    
        // Create a new world with 1500x1000 cells with a cell size of 1x1 pixels.
        super(1500, 1000, 1);
        
        // Adding ships to the world.
        addObject(new ShipGame2(), 1131, 468);
        addObject(new ShipGame2(), 407, 468);
        // Adding PlayerCrane and hook to the world.
        addObject(new Crane(), 173, 446);
        addObject(new Rope(), 283, 333);
        addObject(new Hook(), 270, 672);
        // Adding AICrane and AIhook to the world.        
        addObject(new AICrane(), 897, 446);
        addObject(new AIRope(), 1007, 333);
        addObject(new AIHook(), 994, 672);
        // Adding a second sky which overlays the background to hide the rope. 
        addObject(new Sky(), 600, 144);
        // Adding the timer to the world.
        addObject (new TimerGame2(), 750, 100);
        
        // Adding button to return to the menu the world.
        addObject(new button5(), 39, 963);
        
        // Sets which class shows on top.       
        setPaintOrder(button5.class,Win.class,Lose.class,TimerGame2.class,Crane.class,Crane2.class,AICrane.class,Sky.class,Rope.class,Rope2.class,AIRope.class,ShipGame2.class);
        
        this.showText("Score: " + String.valueOf(score), 400, 200);
        this.showText("Score: " + String.valueOf(score2), 1000, 200);
    }
    public void act() {
        // Checks if enough time has passed to spawn a new container.
        if (I==0)
        {
           if (actCount > 0)
            {actCount--;}
            else {
              if (Math.random() > 0.3) {
               addObject(new Container(), 0, 775);
              } else if (Math.random() > 0.5) {
                  addObject(new ContainerBig(), 0, 775);
              } else if (Math.random() > 0.5) {
                  addObject(new NuclearContainer(), 0, 775);
              } else {
                   addObject(new MysteryContainer(), 0, 775);
              }
              actCount = 150;
           }
           if (actCount > 0)
            {actCount--;}
            else {
              if (Math.random() > 0.3) {
               addObject(new ContainerL(), 1500, 875);
              } else if (Math.random() > 0.5) {
                  addObject(new ContainerBigL(), 1500, 875);
              } else if (Math.random() > 0.5) {
                  addObject(new NuclearContainerL(), 1500, 875);
              } else {
                   addObject(new MysteryContainerL(), 1500, 875);
              }
              actCount = 150;
           }
        }
        // Checks if game is over and compares the scores.
        if (Time > 0)
        {
            if (score>score2)
            {
            addObject(new Win(), 400, 300);
            addObject(new Lose(), 1100, 300);
            }
            if (score2>score)
            {
            addObject(new Lose(), 400, 300);
            addObject(new Win(), 1100, 300);
            }
            if (score2==score)
            {
            addObject(new Win(), 400, 300);
            addObject(new Win(), 1100, 300);
            }
            I = 1;
        }
    }
    // Adds points to the scores.
    public void addScore(int n) {
        this.score = score + n;
        this.showText("Score: " + String.valueOf(score), 400, 200);
    }
    public void addScore2(int m) {
        this.score2 = score2 + m;
        this.showText("Score: " + String.valueOf(score2), 1000, 200);
    }
    // Sets the end of the game.
    public void End(int l) {
        this.Time = Time + l;
    }
}
