/**
 * Write a description of class Points here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Points {

	private int points;
	Counter counter;

	Points() {
		TetrisWorld world = TetrisWorld.getWorld();
		counter = new Counter("");
		world.addObject(counter, world.getWidth() / 2, world.getHeight()-1);
	}

	void add(int points) {
		counter.add(points);
	}
	
	int getPoints() {
	    return counter.getValue();
	}

}
