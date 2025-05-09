import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Li
 * @version May 2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 60);
    Label tutorial = new Label("Use \u2190 and \u2192 to move", 40);
    Label startLabel = new Label("Press space to start", 40);
    /**
     * Constructor for objects of class TitleScreen.
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, getHeight()/2-100);
        addObject(tutorial, getWidth()/2, getHeight()/2-25);
        addObject(startLabel, getWidth()/2, getHeight()/2+25);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        // Starts the gmae if user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the worldf or the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 350);
    }
}
