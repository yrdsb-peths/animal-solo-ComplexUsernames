import greenfoot.*;

/**
 * The World that the main character is in.
 * 
 * @author Li
 * @version April 2025
 */
public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld() {
        super(600, 400, 1, false);
        setBackground(new GreenfootImage("images/background.jpg"));
        
        // Create the elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 350);
        
        // Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createApple();
    }
    
    /**
     * End the game and draw 'GameOver'
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    /**
     * Increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level+=1;
        }
    }
    
    /**
     * Create a new apple at random location at top of screen
     */
    public void createApple()
    {
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}
