import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for the elephant.
 * 
 * @author Li
 * @version April 2025
 */
public class Apple extends Actor
{
    public Apple() {
        setImage("images/apple1.png");
    }

    public void act()
    {
        setLocation(getX(), getY() + 1);
        
        // Remove apple and draw game over when apple gets to bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
