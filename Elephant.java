import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Elephant,main character.
 * 
 * @author Li
 * @version April 2025
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephant4.mp3");
    GreenfootImage idle = new GreenfootImage("images/elephant_idle/idle0.png");
    
    public Elephant()
    {
        setImage(idle);
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(1);
        }
        
        //Remove apple if elephant eats it
        eat();
    }
    
    /**
     * Eat the apple when in contact and spawn new apple if an apple is eaten
     */
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            elephantSound.play();
        }
    }
}
