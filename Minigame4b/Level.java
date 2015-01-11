import greenfoot.*;

public abstract class Level extends World
{
    String[] map;

    public Level()
    {
        super(800, 600, 1);
        setFields();
        for (int i=0; i<map.length; i++) for (int j=0; j<map[i].length(); j++)
            {
                int kind = "cbparh1234f".indexOf(""+map[i].charAt(j));
                if (kind < 0) continue;
                Actor actor = null;
                if (kind == 0) actor = new Player();
                if (kind == 1) actor = new Block();
                if (kind == 2) actor = new Platform2();
                if (kind == 3) actor = new Chain(); 
                if (kind == 4) actor = new RadioactiveBarrel();
                if (kind == 5) actor = new Hook();
                if (kind == 6) actor = new Container();
                if (kind == 7) actor = new Container2();
                if (kind == 8) actor = new ContainerFront();
                if (kind == 9) actor = new ContainerFront2();
                if (kind == 10) actor = new Finish();
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