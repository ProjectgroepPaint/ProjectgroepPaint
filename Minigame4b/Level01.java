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
                             "              c          ",
                             "ppp                      ",
                             "                         ",
                             "                         ",
                             "     pp                  ",
                             "                         ",
                             "             ppppppppp   ",
                             "                         ",
                             "        pp               ",
                             "                         ",
                             "                         ",
                             "             pppp        ",
                             "  ppppp                  ",
                             "                     ppp ",
                             "                         ",
                             "          w         w    ",
                             "                         ",
                             "bbbbbbbbbbbbbbbbbbbbbbbbb" };
    }
}