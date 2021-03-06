import greenfoot.*; // (World, Actor, GreenfootImage, and Greenfoot)


public class ITetromino extends Tetromino {
    // sets color to block which is used to get the rigth image with the right block.
    ITetromino() {
        super("red");
    }

    protected void addedToWorld(World world) {
        direction = genDirection();
        int start = genStartX();
        for (int i = 0; i < 4; i++) {
            getWorld().addObject(b[i], start + i, 2);
        }
        setDirection();
    }
    // Sets Direction
    protected void setDirection() {
        switch (direction) {
        case NORTH:
        case SOUTH:
            for (int i = 0; i < 4; i++) {
                if (i == 1)
                    continue;
                b[i].setLocation(b[1].getX(), b[1].getY() + 1 - i);
            }
            break;

        case WEST:
        case EAST:
            for (int i = 0; i < 4; i++) {
                if (i == 1)
                    continue;
                b[i].setLocation(b[1].getX() - 1 + i, b[1].getY());
            }
            break;
        }
    }

    protected Block leftMost() {
        return b[0];
    }

    protected Block rightMost() {
        return b[3];
    }
    // Checks if its possible to turn the block.
    protected boolean turnPossible() {
        switch (direction) {
        case NORTH:
        case SOUTH:
            return b[0].getX() >= 1
                    && b[3].getX() <= Game3.getWorld().getWidth() - 3;
        default: // EAST, WEST
            return b[0].getY() < Game3.getWorld().getHeight() - 3;
        }
    }

    protected int genStartX() {
        return (int) (Math.random() * (Game3.getWorld().getWidth() - 3));
    }

}
