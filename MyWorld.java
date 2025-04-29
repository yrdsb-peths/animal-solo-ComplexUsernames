import greenfoot.*;

/**
 * The World that the main character is in.
 * 
 * @author Li
 * @version April 2025
 */
public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
    }
}
