/**
 * starter file for Random Artist homework assignment
 * 
 * code has to be added by you 
 * 
 * @author huub & kees
 */
package randartist;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.util.ArrayList; 

public class Cara extends JPanel implements ActionListener {
    Random random = new Random();
    ArrayList<RandomShape> RandomShapes = new ArrayList<RandomShape>();
    int FrameWidth = 400;
    int FrameHeight = 300;
    public Cara() {
        setPreferredSize(new Dimension(FrameWidth,FrameHeight)); // make panel 400 by 300 pixels
        // ... 
    }

    @Override
    protected void paintComponent(Graphics g) { 
        super.paintComponent(g);     // clears the background
        // draw all shapes       
        for (RandomShape shape: RandomShapes){
            shape.draw(g);
        }
    }

    /**
     * redraws the Cara JPanel, when the button is pressed. 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        regenerate();
        repaint();
    }

    public void regenerate() {
        // clear the shapes list
        RandomShapes.clear();
        
        // create random shapes 
        int amntshapes =  0;
        RandomShape shape;
        for (int i = 0; i <= amntshapes ;i ++){
            int shapechooser = random.nextInt(3);
            switch (shapechooser){
                case 0: shape = new RandomCloud(FrameWidth,FrameHeight);
                break;
                case 1: shape = new RandomCloud(FrameWidth,FrameHeight);
                break;
                case 2: shape = new RandomCloud(FrameWidth,FrameHeight);
                break;
                default: shape = new RandomStar(FrameWidth,FrameHeight);
                
            } 
        RandomShapes.add(shape);
           
       
            
        }
    }
 }
