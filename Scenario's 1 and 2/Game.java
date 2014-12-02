import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Game extends World
{
    public static class Vector2
    {
        public float X, Y;
        
        public static final Vector2 Zero = new Vector2(0,0);
        public static final Vector2 UnitX = new Vector2(1,0);
        public static final Vector2 UnitY = new Vector2(0,1);
        
        public Vector2(float x, float y) {
            X = x; Y = y;
        }
        
        public Vector2 mul(float k) 
        {
            return new Vector2(X * k, Y * k);
        }

        public Vector2 add(Vector2 v) 
        {
            return new Vector2(X + v.X, Y + v.Y);
        }

        public Vector2 sub(Vector2 v) 
        {
            return this.add(v.min());
        }

        public Vector2 min() 
        {
            return new Vector2(-X, -Y);
        }
        
        public static float Distance(Vector2 a, Vector2 b) 
        {
            Vector2 ab = a.sub(b);
            return (float)Math.sqrt(ab.X * ab.X + ab.Y * ab.Y);
        }
    }
    
    public static class Texture2D
    {
        public String Path;
        GreenfootImage Image;
        
        public int getWidth() { return Image.getWidth(); }
        public int getHeight() { return Image.getHeight(); }
        
        public Texture2D(String path) {
            Path = path;
            Image = new GreenfootImage(path);
        }
    }

    List<BasicEntity> entities;
    public class DrawingContext {        
        public void BeginDraw()
        {
            for(BasicEntity e : entities)
                removeObject(e);
            entities.clear();
        }
        
        public void Draw(Texture2D t, Vector2 p)
        {
            BasicEntity e = new BasicEntity(t.Path);
            entities.add(e);
            addObject(e, (int)p.X, (int)p.Y);
            //SpriteBatch.Draw(t, p - new Vector2(t.Width, t.Height) / 2, c);
        }
    }
    
    private static class BasicEntity extends Actor
    {
        public BasicEntity(String image)
        {
            setImage(new GreenfootImage(image));
        }
    }
    
    
    public static DrawingContext DrawingContext;
    
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        AsteroidShooterLogic w = new AsteroidShooterLogic();
        addObject(w, 0, 0);
        
        DrawingContext = new DrawingContext();
        entities = new ArrayList<BasicEntity>();
    }
}
