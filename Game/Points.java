public class Points
{
    private int points;
    Counter counter;
    // Adds the counter to the world.
    Points()
    {
        Game3 world = Game3.getWorld();
        counter = new Counter("");
        world.addObject(counter, world.getWidth() / 2, world.getHeight()-1);
    }
    // Adds points to the score.
    void add(int points)
    {
        counter.add(points);
    }
    // Returns the amount of points as an integer.
    int getPoints() 
    {
        return counter.getValue();
    }
}
