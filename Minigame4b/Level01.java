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
                             "ppp                      ",
                             "                         ",
                             "                         ",
                             "     pp                  ",
                             "                 r       ",
                             "             ppppppppp   ",
                             "                         ",
                             "        pp               ",
                             "                         ",
                             "               r         ",
                             "             pppp        ",
                             "  ppppp               r  ",
                             "                     ppp ",
                             "                         ",
                             "      c    1         1   ",
                             "                         ",
                             "bbbbbbbbbbbbbbbbbbbbbbbbb" };
    }
}