import greenfoot.*; // (World, Actor, GreenfootImage, and Greenfoot)

public class Block extends Actor {
	// Sets image of the block based on color.
    Block(String color) {
		setImage(color + "-block.png");
	}
}
