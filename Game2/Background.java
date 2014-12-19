import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Background extends World
{
    private int actCount = 0;
    private int score = 0;
    private int score2 = 0;
    private int Time = 0;
    private int I = 0;
    public Background()
    {    
        super(1500, 1000, 1);
        
        addObject(new Ship(), 1131, 468);
        addObject(new Ship(), 407, 468);
        
        addObject(new Crane(), 173, 446);
        addObject(new Rope(), 270, 472);
        addObject(new Hook(), 270, 672);
        
        
        addObject(new AICrane(), 897, 446);
        addObject(new AIRope(), 994, 472);
        addObject(new AIHook(), 994, 672);
        
        
        addObject(new Sky(), 600, 144);
        addObject(new Button(), 25, 50);
        addObject (new Timer(), 750, 100);
               
        setPaintOrder(Win.class,Lose.class,Timer.class,Button.class,Crane.class,Crane2.class,AICrane.class,Sky.class,Rope.class,Rope2.class,AIRope.class,Ship.class);
        
        this.showText("Score: " + String.valueOf(score), 400, 200);
        this.showText("Score: " + String.valueOf(score2), 1000, 200);
    }
    public void act() {
        if (I==0)
        {
        if (actCount > 0)
            {actCount--;}
        else {
              if (Math.random() > 0.2) {
               addObject(new Container(), 0, 775);
              } else {
               addObject(new ContainerBig(), 0, 775);
              }
              actCount = 150;
             }
        if (actCount > 0)
            {actCount--;}
        else {
           if (Math.random() > 0.2) {
               addObject(new ContainerL(), 1500, 875);
              } else {
               addObject(new ContainerBigL(), 1500, 875);
              }
           actCount = 150;
            }
        }
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
    public void addScore(int n) {
        this.score = score + n;
        this.showText("Score: " + String.valueOf(score), 400, 200);
    }
    public void addScore2(int m) {
        this.score2 = score2 + m;
        this.showText("Score: " + String.valueOf(score2), 1000, 200);
    }
    public void End(int l) {
        this.Time = Time + l;
    }
}
