public class Points
{

	private int points;
	Counter counter;

	Points()
	{
		Game3 world = Game3.getWorld();
		counter = new Counter("");
		world.addObject(counter, world.getWidth() / 2, world.getHeight()-1);
	}
	void add(int points)
	{
		counter.add(points);
	}
	int getPoints()
	{
	    return counter.getValue();
	}
}
