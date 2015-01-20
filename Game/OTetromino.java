import greenfoot.*; // (World, Actor, GreenfootImage, and Greenfoot)


public class OTetromino extends Tetromino {
	// Sets color to block which is used to get the right image with the right block.
    OTetromino() {
		super("blue");
	}

	protected void addedToWorld(World world) {
		direction = NORTH;
		int start = genStartX();
		getWorld().addObject(b[0], start, 0);
		getWorld().addObject(b[1], start + 1, 0);
		getWorld().addObject(b[2], start, 1);
		getWorld().addObject(b[3], start + 1, 1);
	}

	protected void setDirection() {
	}

	protected boolean turnPossible() {
		return false;
	}

	protected Block leftMost() {
		return b[0];
	}

	protected Block rightMost() {
		return b[1];
	}

	protected int genStartX() {
		return (int) (Math.random() * (Game3.getWorld().getWidth() - 1));
	}
}