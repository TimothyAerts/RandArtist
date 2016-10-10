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

class RandomStar extends RandomShape {
    protected int vertexcount;
    protected double angle;
    protected int[] X;
    protected int[] Y;
    protected int midx;
    protected int midy;
    protected int innerradius;
    protected int outerradius;
    protected boolean fill;
    
    public RandomStar(int maxX, int maxY){
        super(maxX,maxY);
        fill = random.nextBoolean();
        angle = 0.00;
        midx = random.nextInt(maxX);
        midy = random.nextInt(maxY);
        outerradius = random.nextInt(maxX/3);
        innerradius = outerradius/(random.nextInt(5) + 1);
        vertexcount = random.nextInt(25) + 5;
        if (vertexcount % 2 != 0){
            vertexcount = vertexcount + 1;
        }
        double vrtxcnt = (double) vertexcount;
        X = new int[vertexcount];
        Y = new int[vertexcount];
        double angleincrease = ((Math.PI*2)/vrtxcnt);
        for (int i=0; i< vertexcount; i++){
            if ( i %2 == 0){
                X[i] =(int) (Math.round((Math.cos(angle) * outerradius)))+ midx;
                Y[i] = (int) (Math.round((Math.sin(angle)* outerradius))) + midy;

                angle += angleincrease;  
            }else{
                X[i] =(int) (Math.round((Math.cos(angle) * innerradius)))+ midx;
                Y[i] = (int) (Math.round((Math.sin(angle)* innerradius))) + midy;

                angle += angleincrease;  
            }

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
