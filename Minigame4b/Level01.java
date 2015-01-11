import greenfoot.Greenfoot;

public class Level01 extends Level
{
    /** ********************      MAP LEGEND     *********************** */
    //      b = block        r = radioactive barrel     4 = container front 2     
    //      p = platform     1 = container variety 1    f = finish
    //      h = hook         2 = container variety 1   
    //      c = character    3 = container front 1          
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
                             "    2    3      p   1    ",
                             "            r  pp        ",
                             "bbbbbbbbbbbbbbbbbbbbbbbbb" };
    }
    
    public void nextLevel()
    {
        Greenfoot.setWorld(new Level02());
    }
}