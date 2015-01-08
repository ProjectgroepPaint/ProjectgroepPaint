import greenfoot.Greenfoot;

public class Level02 extends Level
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
                             "                         ",
                             "             pppp        ",
                             "                      r  ",
                             "                     ppp ",
                             "                         ",
                             "         r     pp    1   ",
                             "  c                      ",
                             "bbbbbbbbbbbbbbbbbbbbbbbbb" };
    }
}
