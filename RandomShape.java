/**
 * the mother of all random shapes
 * should be used unchanged
 *
 * @author huub
 */
package randartist;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

abstract class RandomShape {  
    /** random number generator; shared by all RandomShapes */
    static Random random = new Random(); 
    
    /** color used for drawing this shape **/
    protected Color color;  
    /** position of the shape (upper left corner) **/
    protected int x, y;  
    
    /**
     * initializes color and position to random values
     * 
     * @param maxX, maxY give maximum values for the position
     */
    public RandomShape( int maxX, int maxY ) {
        // initialize to a random position
        x = random.nextInt(maxX);
        y = random.nextInt(maxY);
        // initialize to a random color
        //real random
        float r = random.nextFloat();
        float g = random.nextFloat();
        float b = random.nextFloat();
        float alpha = random.nextFloat();
        color = new Color(r,g,b,alpha);
        //gausian random

        
    }
    
    abstract void draw(Graphics g);
}
