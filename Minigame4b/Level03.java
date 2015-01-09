import greenfoot.Greenfoot;

public class Level03 extends Level
{
    /** ********************      MAP LEGEND     *********************** */
    //      b = block        r = radioactive barrel     
    //      p = platform     1 = container variety 1         
    //      c = character    h = hook          
    public void setFields()
    {
        map = new String[] { "                         ",
                             "h                        ",
                             "                         ",
                             "                         ",
                             "                         ",
                             "                         ",
                             "                         ",
                             "                         ",
                             "                         ",
                             "                         ",
                             "                         ",
                             "                         ",
                             "                         ",
                             "                         ",
                             "                         ",
                             "                         ",
                             "                         ",
                             "  c                      ",
                             "bbbbbbbbbbbbbbbbbbbbbbbbb" };
    }
    
    public void nextLevel()
    {
        Greenfoot.setWorld(new Level04());
    }
}
