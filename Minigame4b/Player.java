import greenfoot.*;

public class Player extends Actor
{
    private int vSpeed = 0;
    private int acceleration = 1;
    private boolean jumping;
    private int jumpStrength = 16;
    private int speed = 4;
    private int level;
    private boolean hashkey = false;
    private int direction = 1; // 1 = right and -1 = left
    
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKey();
        checkFall();
        platformAbove();
        checkRightWalls();
        checkLeftWalls();
        checkHit();
        checkNextLevel();
    }   
    
    public void checkKey()
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
    
    public void moveRight()
    {
        setLocation(getX()+speed, getY());
    }
    
        public void moveLeft()
    {
        setLocation(getX()-speed, getY());
    }
    
        public boolean platformAbove()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/-2);
        Actor ceiling = getOneObjectAtOffset(0, yDistance, Platform.class);
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
    
    
    public boolean checkRightWalls()
    {
        int spriteWidth = getImage().getWidth();
        int xDistance = (int)(spriteWidth/2);
        Actor rightWall = getOneObjectAtOffset(xDistance, 0, Platform.class);
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

    public void stopByRightWall(Actor rightWall)
    {
        int wallWidth = rightWall.getImage().getWidth();
        int newX = rightWall.getX() - (wallWidth + getImage().getWidth())/2;
        setLocation(newX - 5, getY());

    }

    public boolean checkLeftWalls()
    {
        int spriteWidth = getImage().getWidth();
        int xDistance = (int)(spriteWidth/-2);
        Actor leftWall = getOneObjectAtOffset(xDistance, 0, Platform.class);
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

    public void stopByLeftWall(Actor leftWall)
    {
        int wallWidth = leftWall.getImage().getWidth();
        int newX = leftWall.getX() + (wallWidth + getImage().getWidth())/2;
        setLocation(newX + 5, getY());
    }

    public void bopHead(Actor ceiling)
    {
        int ceilingHeight = ceiling.getImage().getHeight();
        int newY = ceiling.getY() + (ceilingHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
    }

    public void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        if(vSpeed <=9)
        {
            vSpeed = vSpeed + acceleration;
        }
        jumping = true;
    }

    public boolean onGround()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/2) + 5;
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2, Platform.class);
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

    public void moveToGround(Actor ground)
    {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
        jumping = false;
    }

    public void checkFall()
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

    public void jump()
    {
        vSpeed = vSpeed - jumpStrength;
        jumping = true;
        fall();
    }
    
    public void checkHit() 
    {
    if (getOneIntersectingObject (RadioactiveBarrel.class) != null){
            World myWorld = getWorld();
            myWorld.removeObject(this);
            gameOver gameover= new gameOver();
            myWorld.addObject (gameover,myWorld.getWidth()/2, myWorld.getHeight()/2);
        }
    else if (getOneIntersectingObject (Hook.class) != null){
            World myWorld = getWorld();
            myWorld.removeObject(this);
            gameOver gameover= new gameOver();
            myWorld.addObject (gameover,myWorld.getWidth()/2, myWorld.getHeight()/2);
        }
    }
    
     private void checkNextLevel()
    {
        if (getX() == getWorld().getWidth()-1) ((Level)getWorld()).nextLevel();
    }
}