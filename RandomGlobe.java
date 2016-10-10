/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randartist;

/**
 *
 * @author timothy
 */
import java.awt.*;
import static randartist.RandomShape.random;

class RandomGlobe extends RandomShape {
    protected int vertexcount;
    protected double angle;
    protected int[] X;
    protected int[] Y;
    protected int midx;
    protected int midy;
    protected int radius;
    protected boolean fill;
    
    public RandomGlobe(int maxX, int maxY){
        super(maxX,maxY);
//        fill = random.nextBoolean();
        fill = true;
        angle = 0.00;
        midx = random.nextInt(maxX);
        midy = random.nextInt(maxY);
        radius = random.nextInt(maxX/4);
        vertexcount = random.nextInt(125) + 25;
        double vrtxcnt = (double) vertexcount;
        X = new int[vertexcount];
        Y = new int[vertexcount];
        double angleincrease = ((Math.PI*2)/vrtxcnt);
        System.out.println("angleincrease origineel"  + angleincrease);
        for (int i=0; i< vertexcount; i++){
                        
            X[i] =(int) (Math.round((Math.cos(angle + angleincrease) * radius)))+ midx;
            Y[i] = (int) (Math.round((Math.sin(angle + angleincrease)* radius))) + midy;
            angleincrease += angleincrease;
        }   
    }
    
    @Override
    void draw (Graphics g) {
    g.setColor(color);
    if (fill){
        g.fillPolygon(X,Y,vertexcount);
    }else{
        g.drawPolygon(X,Y,vertexcount);
    }
    
}
}
