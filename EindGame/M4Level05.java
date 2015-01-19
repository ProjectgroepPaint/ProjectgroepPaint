import greenfoot.Greenfoot;

public class M4Level05 extends M4Level
{
    /** ********************      MAP LEGEND     *********************** */
    //      b = block        r = radioactive barrel     4 = container front 2     
    //      p = platform     1 = container variety 1    f = finish
    //      h = hook         2 = container variety 1    a = chain
    //      c = character    3 = container front 1          
    public void setFields()
    {
        map = new String[] { "   a     a     a     a   ",
                             "h  a     a     a     a   ",
                             "   a     a     a     a   ",
                             "   a     a     a     a   ",
                             "         a     a     a   ",
                             "   4     a     a     a   ",
                             "         a     a     a   ",
                             "         a     a     a   ",
                             "                     a   ",
                             "            1        a   ",
                             "                         ",
                             "                     3   ",
                             "                         ",
                             "                         ",
                             "                         ",
                             "                         ",
                             "                         ",
                             "  c  r   r   r   r   r   ",
                             "bbbbbbbbbbbbbbbbbbbbbbbbb" };
    }
    
    public void nextLevel()
    {
        Greenfoot.setWorld(new M4LevelFinish());
    }
}
