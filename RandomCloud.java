/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randartist;
import java.awt.Graphics;
import java.awt.Color;
/**
 *
 * @author timothy
 */
class RandomCloud extends RandomShape{
    protected boolean fill;
    protected double angle;
    protected int midx;
    protected int midy;
    protected int radius;
    protected int vertexcount;
    protected int[] X;
    protected int[] Y;
    protected Color circlecolor;
    public RandomCloud (int maxX, int maxY){
        super(maxX,maxY);
        fill = random.nextBoolean();
        angle = 0.00;
        radius = 25;
        midx = random.nextInt(maxX) + radius;
        midy = random.nextInt(maxY) + radius;
        vertexcount = 100;
        double vrtxcnt = (double) vertexcount;
        X = new int[vertexcount];
        Y = new int[vertexcount];
        double angleincrease = ((Math.PI*2)/vrtxcnt);
        for (int i=0; i< vertexcount; i++){
                        
            int circlex =(int) Math.round((Math.cos(angle) * radius))+ midx;
            int circley = (int) Math.round((Math.sin(angle)* radius)) + midy;
            angle += angleincrease;
      
                X[i] = circlex;
                Y[i] = circley;
                
            
            System.out.println("X: " + X[i]);
           
        }   
    }
    public void cloudcircle(int midx, int midy, Graphics g){
        g.fillArc(midx,midy,55,55,0,360);
    }
   @Override
   void draw (Graphics g){
       g.setColor(color);
       for (int i=0; i<X.length; i++){
          shape = new cloudcircle(X[i],Y[i],g);
       }
       
   }
    }
    
    
    

