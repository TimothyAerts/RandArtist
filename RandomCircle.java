/**
 * RandomCircle -- part of HA RandomArtist
 * example of a very simple RandomShape 
 * @author huub
 */
package randartist;
import java.awt.Graphics;

/**
 *
 * @author huub
 */
class RandomCircle extends RandomCloud {
    protected int radius;
    protected boolean fill; //true: filled
    
    public RandomCircle(int maxX, int maxY) {
        super(maxX, maxY);
        radius = 55;
        fill = random.nextBoolean();
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillArc(x, y, radius, radius,0, 360);
    }    
}
