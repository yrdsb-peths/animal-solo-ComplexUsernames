import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for the elephant.
 * 
 * @author Li
 * @version April 2025
 */
public class Apple extends Actor
{
    int speed = 1;
    
    public Apple() {
        GreenfootImage apple = new GreenfootImage("images/apple.png");
        apple.scale(50,50);
        setImage(apple);
    }

    public void act()
    {
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        // Remove apple and draw game over when apple gets to bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
