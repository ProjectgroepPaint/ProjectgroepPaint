import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

public class Counter extends Actor
{
   private static final Color textColor = new Color(0, 0, 0);
    
   private int value = 0;
   private String text;

   // Create a Counter
   public Counter()
    {
        this("");
    }

    public Counter(String prefix)
    {
        text = prefix;
    }
    // make the image
    protected void addedToWorld(World world) {
        GreenfootImage image = 
        new GreenfootImage(world.getWidth() * world.getCellSize(), world.getCellSize()*2);
        setImage(image);
        image.setColor(textColor);
        Font font = image.getFont();
        font = font.deriveFont(24.0f);
        image.setFont(font);
        updateImage();
    }

    public void add(int points)
    {
        value += points;
        updateImage();
    }

    public void subtract(int points)
    {
        value -= points;
        updateImage();
    }
    
    public int getValue() {
        return value;
    }

    /**
     * Make the image
     */
    private void updateImage()
    {
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + value, 10, 20);
    }
}
