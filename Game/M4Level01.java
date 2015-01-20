import greenfoot.Greenfoot;

public class M4Level01 extends M4Level
{
    /** ********************      MAP LEGEND     *********************** */
    //      b = block        r = radioactive barrel     4 = container front 2     
    //      p = platform     1 = container variety 1    f = finish
    //      h = hook         2 = container variety 1    a = chain
    //      c = character    3 = container front 1      i = instructions    
    protected void setFields()
    {
        map = new String[] { "                         ",
                             "h                        ",
                             "                   i     ",
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
    
    protected void nextLevel()
    {
        Greenfoot.setWorld(new M4Level02());
    }
}