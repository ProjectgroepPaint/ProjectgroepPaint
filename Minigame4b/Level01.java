import greenfoot.Greenfoot;

public class Level01 extends Level
{
    /** ********************      MAP LEGEND     *********************** */
    //      b = block        m = monster         f = floating platform
    //      p = platform     k = key             w = wall
    //      c = character    d = door            s = score
    public void setFields()
    {
        map = new String[] { "                         ",
                             " m                       ",
                             "ppp                      ",
                             "                         ",
                             "                         ",
                             "     pp                  ",
                             "                         ",
                             "             ppppppppp   ",
                             "                         ",
                             "        pp               ",
                             "                         ",
                             "               m         ",
                             "             pppp        ",
                             "  ppppp                  ",
                             "                     ppp ",
                             "                         ",
                             "   c      w         w    ",
                             "                         ",
                             "bbbbbbbbbbbbbbbbbbbbbbbbb" };
    }
}