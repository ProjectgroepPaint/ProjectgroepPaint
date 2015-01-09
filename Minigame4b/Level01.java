import greenfoot.Greenfoot;

public class Level01 extends Level
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
                             "   c                     ",
                             "pppppp                   ",
                             "          r              ",
                             "        ppp              ",
                             "                         ",
                             "           r             ",
                             "          pppppp         ",
                             "                         ",
                             "    1                    ",
                             "                    r    ",
                             "                         ",
                             "    2    s      p   1    ",
                             "            r  pp        ",
                             "bbbbbbbbbbbbbbbbbbbbbbbbb" };
    }
    
    public void nextLevel()
    {
        Greenfoot.setWorld(new Level02());
    }
}