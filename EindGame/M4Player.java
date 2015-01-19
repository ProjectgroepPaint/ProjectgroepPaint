import greenfoot.*;

public class M4Player extends Actor
{
    private int vSpeed = 0;
    private int acceleration = 1;
    private boolean jumping;
    private int jumpStrength = 16;
    private int speed = 4;
    private int level;
    private boolean hashkey = false;
    private int direction = 1; // 1 = right and -1 = left
        
    public void act() 
    {
        checkKey();
        checkFall();
        platformAbove();
        checkRightWalls();
        checkLeftWalls();
        checkPlayerStatus();
    }
   
    public void checkPlayerStatus()
    {
        // Checks if the player hits a dangerous obstacle
        if (getOneIntersectingObject (M4RadioactiveBarrel.class) != null)
        {
            World myWorld = getWorld();
            myWorld.removeObject(this);
            M4gameOver gameover= new M4gameOver();
            myWorld.addObject (gameover,myWorld.getWidth()/2, myWorld.getHeight()/2);
        }
        else if (getOneIntersectingObject (M4Hook.class) != null)
        {
            World myWorld = getWorld();
            myWorld.removeObject(this);
            M4gameOver gameover= new M4gameOver();
            myWorld.addObject (gameover,myWorld.getWidth()/2, myWorld.getHeight()/2);
        }
        // Checks if player has reached the end of the level
        else if (getX() == getWorld().getWidth()-1)
        {
            ((M4Level)getWorld()).nextLevel();
        }
    }
    
    // Checks the keys the user is pressing to return the action
    private void checkKey()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            direction = 1;
            moveRight();
            setImage("m4player.png");
        }
        if(Greenfoot.isKeyDown("left"))
        {
            direction = -1;
            moveLeft();
            setImage("m4player-left.png");
        }
        if((Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("space")) && jumping == false)
        {
            jump();
        }
    }
    
    // Player movement left & right
    private void moveRight()
    {
        setLocation(getX()+speed, getY());
    }
    
    private void moveLeft()
    {
        setLocation(getX()-speed, getY());
    }
    
    // Checks for obstacles above the player
    private boolean platformAbove()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/-2);
        Actor ceiling = getOneObjectAtOffset(0, yDistance, M4Platform.class);
        if(ceiling != null)
        {
            vSpeed = 1;
            bopHead(ceiling);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    // Checks obstacles on the right of player
    private boolean checkRightWalls()
    {
        int spriteWidth = getImage().getWidth();
        int xDistance = (int)(spriteWidth/2);
        Actor rightWall = getOneObjectAtOffset(xDistance, 0, M4Platform.class);
        if(rightWall == null)
        {
            return false;
        }
        else
        {
            stopByRightWall(rightWall);
            return true;
        }
    }

    // Stops player from running through obstacles
    private void stopByRightWall(Actor rightWall)
    {
        int wallWidth = rightWall.getImage().getWidth();
        int newX = rightWall.getX() - (wallWidth + getImage().getWidth())/2;
        setLocation(newX - 5, getY());

    }

    // Checks obstacles on the left of player
    private boolean checkLeftWalls()
    {
        int spriteWidth = getImage().getWidth();
        int xDistance = (int)(spriteWidth/-2);
        Actor leftWall = getOneObjectAtOffset(xDistance, 0, M4Platform.class);
        if(leftWall == null)
        {
            return false;
        }
        else
        {
            stopByLeftWall(leftWall);
            return true;
        }
    }

    // Stops player from running through obstacles
    private void stopByLeftWall(Actor leftWall)
    {
        int wallWidth = leftWall.getImage().getWidth();
        int newX = leftWall.getX() + (wallWidth + getImage().getWidth())/2;
        setLocation(newX + 5, getY());
    }
    
    // Bounces player off ceiling to stop them from jumping through
    private void bopHead(Actor ceiling)
    {
        int ceilingHeight = ceiling.getImage().getHeight();
        int newY = ceiling.getY() + (ceilingHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
    }

    // Checks if player is on a platform
    private boolean onGround()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/2) + 5;
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2, M4Platform.class);
        if(ground == null)
        {
            jumping = true; 
            return false; 
        }
        else
        {
            moveToGround(ground);
            return true;
        }
    }

    private void moveToGround(Actor ground)
    {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
        jumping = false;
    }

    // Checks if the player should be falling
    private void checkFall()
    {
        if(onGround())
        {
            vSpeed = 0;
        }
        else
        {
            fall();
        }
    }

    // Allows player to fall off platforms
    private void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        if(vSpeed <=9)
        {
            vSpeed = vSpeed + acceleration;
        }
        jumping = true;
    }
    
    private void jump()
    {
        vSpeed = vSpeed - jumpStrength;
        jumping = true;
        fall();
    }
}