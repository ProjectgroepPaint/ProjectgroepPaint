import greenfoot.*;

public abstract class M4Level extends World
{
    String[] map;

    public M4Level()
    {
        super(800, 600, 1);
        setFields();
        for (int i=0; i<map.length; i++) for (int j=0; j<map[i].length(); j++)
            {
                int kind = "cbparh1234fi".indexOf(""+map[i].charAt(j));
                if (kind < 0) continue;
                Actor actor = null;
                if (kind == 0) actor = new M4Player();
                if (kind == 1) actor = new M4Block();
                if (kind == 2) actor = new M4Platform2();
                if (kind == 3) actor = new M4Chain(); 
                if (kind == 4) actor = new M4RadioactiveBarrel();
                if (kind == 5) actor = new M4Hook();
                if (kind == 6) actor = new M4Container();
                if (kind == 7) actor = new M4Container2();
                if (kind == 8) actor = new M4ContainerFront();
                if (kind == 9) actor = new M4ContainerFront2();
                if (kind == 10) actor = new M4Finish();
                if (kind == 11) actor = new M4Instructions();
                addObject(actor, 16+j*32, 16+i*32);
        }
        
        setPaintOrder(
        M4gameOver.class,
        M4Hook.class, 
        M4Player.class,
        M4RadioactiveBarrel.class, 
        M4Platform2.class, 
        M4Container.class, 
        M4Block.class
        );
    }
    
    public void setFields() {}

    public void nextLevel() {}
   
}