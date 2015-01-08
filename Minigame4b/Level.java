import greenfoot.*;

public abstract class Level extends World
{
    String[] map;

    public Level()
    {
        super(800, 600, 1);
        //setBackground(new GreenfootImage("StartScreen.png")); // Splash Screen
        setFields();
        for (int i=0; i<map.length; i++) for (int j=0; j<map[i].length(); j++)
            {
                int kind = "cbp1rh".indexOf(""+map[i].charAt(j));
                if (kind < 0) continue;
                Actor actor = null;
                if (kind == 0) actor = new Player();
                if (kind == 1) actor = new Block();
                if (kind == 2) actor = new Platform2();
                if (kind == 3) actor = new Container();
                if (kind == 4) actor = new RadioactiveBarrel();
                if (kind == 5) actor = new Hook();
                addObject(actor, 16+j*32, 16+i*32);
        }
        
        setPaintOrder(
        gameOver.class,
        Hook.class, 
        Player.class,
        RadioactiveBarrel.class, 
        Platform2.class, 
        Container.class, 
        Block.class
        );
    }
    
    public void setFields() {}

    public void nextLevel() {}
   
}