import greenfoot.*;
import java.util.*;
import javax.swing.*;

public class AsteroidShooterLogic extends Actor
{
    Game.Vector2 shipPosition;
    List<Game.Vector2> asteroidPositions;
    List<Game.Vector2> projectilePositions;
    boolean lastFrameSpaceState;
    float timeSinceLastShot;
    float timeSinceLastAsteroid;
    Random randomGenerator;
    Game.Vector2 backgroundPosition;
    Game.Texture2D shipAppearance;
    Game.Texture2D asteroidAppearance;
    Game.Texture2D plasmaAppearance;
    Game.Texture2D backgroundAppearance;
    
    
    public AsteroidShooterLogic()
    {
        GreenfootImage img = null;
        setImage(img);
        shipPosition = new Game.Vector2(320, 240);
        asteroidPositions = new ArrayList<Game.Vector2>();
        projectilePositions = new ArrayList<Game.Vector2>();
        lastFrameSpaceState = false;
        timeSinceLastShot = 0.0f;
        timeSinceLastAsteroid = 0.0f;
        randomGenerator = new Random();
        backgroundPosition = Game.Vector2.Zero;

        shipAppearance = new Game.Texture2D("ship.png");
        asteroidAppearance = new Game.Texture2D("asteroid.png");
        plasmaAppearance = new Game.Texture2D("plasmaSmall.png");
        backgroundAppearance = new Game.Texture2D("starfield.jpg");
    }

    public void act() 
    {
        float dt = 1.0f / 60.0f;
        
        if (Greenfoot.isKeyDown("A"))
          shipPosition = shipPosition.sub(Game.Vector2.UnitX.mul(dt).mul(300.0f));
        if (Greenfoot.isKeyDown("D"))
          shipPosition = shipPosition.add(Game.Vector2.UnitX.mul(dt).mul(300));
        if (Greenfoot.isKeyDown("W"))
          shipPosition = shipPosition.sub(Game.Vector2.UnitY.mul(dt).mul(300.0f));
        if (Greenfoot.isKeyDown("S"))
          shipPosition = shipPosition.add(Game.Vector2.UnitY.mul(dt).mul(300.0f));
        if ((lastFrameSpaceState == false || timeSinceLastShot > 1.0f / 7.0f) && 
             Greenfoot.isKeyDown(" "))
        {
          projectilePositions.add(shipPosition);
          timeSinceLastShot = 0;
        }
        lastFrameSpaceState = Greenfoot.isKeyDown(" ");
        timeSinceLastShot += dt;

        if (timeSinceLastAsteroid >= (float)(randomGenerator.nextDouble() * 1.5 + 0.1))
        {
          Game.Vector2 newAsteroidPosition = Game.Vector2.Zero;
          boolean collision = false;
          do
          {
            newAsteroidPosition = new Game.Vector2(randomGenerator.nextInt(800), -50);
            collision = false;
            for(Game.Vector2 a : asteroidPositions)
            {
              if (Game.Vector2.Distance(a, newAsteroidPosition) <= 50.0)
              {
                collision = true;
                break;
              }
            }
          } while (collision);
          asteroidPositions.add(newAsteroidPosition);
          timeSinceLastAsteroid = 0.0f;
        }
        timeSinceLastAsteroid += dt;

        for (int i = 0; i < projectilePositions.size(); i++)
        {
          projectilePositions.set(i, projectilePositions.get(i).sub(Game.Vector2.UnitY.mul(dt).mul(150)));
          if (projectilePositions.get(i).Y <= -20)
            projectilePositions.remove(i);
        }

        for (int i = 0; i < asteroidPositions.size(); i++)
        {
          asteroidPositions.set(i, asteroidPositions.get(i).add(Game.Vector2.UnitY.mul(dt).mul(20)));
          if (asteroidPositions.get(i).Y >= 600)
            asteroidPositions.remove(i);
        }

        for (int i = 0; i < projectilePositions.size(); i++)
        {
          boolean removeProjectile = false;
          for (int j = 0; j < asteroidPositions.size(); j++)
          {
            if (Game.Vector2.Distance(projectilePositions.get(i), asteroidPositions.get(j)) <= 20.0f)
            {
              removeProjectile = true;
              asteroidPositions.remove(j);
              break;
            }
          }
          if (removeProjectile)
          {
            projectilePositions.remove(i);
            i--;
          }
        }

        for (int i = 0; i < asteroidPositions.size(); i++)
        {
          if (Game.Vector2.Distance(asteroidPositions.get(i), shipPosition) <= 20.0)
          {
            JOptionPane.showMessageDialog(new JInternalFrame(), "Click OK to restart","Game over!", JOptionPane.INFORMATION_MESSAGE); 
            Greenfoot.setWorld(new Game());
          }
        }

        backgroundPosition = new Game.Vector2(400, backgroundPosition.Y + dt * 100);
        if (backgroundPosition.Y > 600)
          backgroundPosition.Y -= backgroundAppearance.getHeight();

        if(Greenfoot.isKeyDown("escape"))
          Greenfoot.stop();
        
        Game.DrawingContext drawingContext = Game.DrawingContext;
        drawingContext.BeginDraw();

        for (int i = -1; i < 2; i++)
          for (int j = -1; j < 2; j++)
          drawingContext.Draw(backgroundAppearance, backgroundPosition.add(
            Game.Vector2.UnitX.mul(j).mul(backgroundAppearance.getWidth()).add(
            Game.Vector2.UnitY.mul(i).mul(backgroundAppearance.getHeight()))));
        for(Game.Vector2 p : projectilePositions)
          drawingContext.Draw(plasmaAppearance, p);
        drawingContext.Draw(shipAppearance, shipPosition);
        for(Game.Vector2 a : asteroidPositions)
          drawingContext.Draw(asteroidAppearance, a);

        Game.DrawingContext.Draw(shipAppearance, shipPosition);
    }    
}
