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

class RandomPolygon extends RandomShape {
    protected int vertexcount;
    protected double angle;
    protected int[] X;
    protected int[] Y;
    protected int midx;
    protected int midy;
    protected int radius;
    protected boolean fill;
    
    public RandomPolygon(int maxX, int maxY){
        super(maxX,maxY);
        fill = random.nextBoolean();
        angle = 0.00;
        midx = random.nextInt(maxX);
        midy = random.nextInt(maxY);
        radius = random.nextInt(maxX/4);
        vertexcount = random.nextInt(20) + 3;
        double vrtxcnt = (double) vertexcount;
        X = new int[vertexcount];
        Y = new int[vertexcount];
        double angleincrease = ((Math.PI*2)/vrtxcnt);
        System.out.println("angleincrease origineel"  + angleincrease);
        for (int i=0; i< vertexcount; i++){
                        
            X[i] =(int) (Math.round((Math.cos(angle) * radius)))+ midx;
            Y[i] = (int) (Math.round((Math.sin(angle)* radius))) + midy;
            System.out.println("X: " + X[i]);
            angle += angleincrease;
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
