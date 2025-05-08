import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Elephant,main character.
 * 
 * @author Li
 * @version April 2025
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] idle = new GreenfootImage[8];
    
    /**
     * Constructor for the elephant
     */
    public Elephant()
    {
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
        }
        setImage(idle[0]);
    }

    /**
     * Animate the elephant
     */
    int imageIndex = 0;
    public void animateElephant()
    {
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
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

        //Animate the elephant
        animateElephant();
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
