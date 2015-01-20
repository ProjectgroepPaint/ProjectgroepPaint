import greenfoot.*; // (World, Actor, GreenfootImage, and Greenfoot)


public class ZTetromino extends Tetromino {
    // Sets color to block which is used to get the right image with the right block.
    ZTetromino() {
        super("cyan");
    }

    protected void addedToWorld(World world) {
        direction = genDirection();
        int start = genStartX();
        getWorld().addObject(b[0], start, 1);
        getWorld().addObject(b[1], start + 1, 1);
        getWorld().addObject(b[2], start + 1, 2);
        getWorld().addObject(b[3], start + 2, 2);
        setDirection();
    }
    // Sets Direction
    protected void setDirection() {
        switch (direction) {
        case NORTH:
        case SOUTH:
            b[0].setLocation(b[1].getX() - 1, b[1].getY());
            b[2].setLocation(b[1].getX(), b[1].getY() + 1);
            b[3].setLocation(b[1].getX() + 1, b[1].getY() + 1);
            break;
        case WEST:
        case EAST:
            b[0].setLocation(b[1].getX(), b[1].getY() - 1);
            b[2].setLocation(b[1].getX() - 1, b[1].getY());
            b[3].setLocation(b[1].getX() - 1, b[1].getY() + 1);
            break;
        }
    }

    protected Block leftMost() {
        switch (direction) {
        case NORTH:
        case SOUTH:
            return b[0];
        default: // WEST, EAST
            return b[2];
        }
    }

    protected Block rightMost() {
        switch (direction) {
        case NORTH:
        case SOUTH:
            return b[3];
        default: // WEST, EAST
            return b[1];
        }
    }
    // Checks if its possible to turn the block.
    protected boolean turnPossible() {
        Game3 world = Game3.getWorld();
        switch (direction) {
        case NORTH:
        case SOUTH:
            return b[2].getY() < world.getHeight() - 3;
        default: // WEST, EAST
            return b[1].getX() < world.getWidth() - 1;
        }
    }

    protected int genStartX() {
        return (int) (Math.random() * (Game3.getWorld().getWidth() - 2));
    }

}
