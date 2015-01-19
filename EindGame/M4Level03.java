import greenfoot.Greenfoot;

public class M4Level03 extends M4Level
{
    /** ********************      MAP LEGEND     *********************** */
    //      b = block        r = radioactive barrel     4 = container front 2     
    //      p = platform     1 = container variety 1    f = finish
    //      h = hook         2 = container variety 1    a = chain
    //      c = character    3 = container front 1          
    protected void setFields()
    {
        map = new String[] { "     a a a               ",
                             "h    a a a               ",
                             "     a a a               ",
                             "     a a a               ",
                             "     a a a               ",
                             "     a a a               ",
                             "     a a a               ",
                             "     a a a r             ",
                             "     a a p r             ",
                             "     a a                 ",
                             "     a a     2           ",
                             "     a p                 ",
                             "     a                   ",
                             "     a     3   4         ",
                             "     a                   ",
                             "     p                   ",
                             "             1   r       ",
                             "  c              rr      ",
                             "bbbbbbbbbbbbbbbbbbbbbbbbb" };
    }
    
    protected void nextLevel()
    {
        Greenfoot.setWorld(new M4Level04());
    }
}
