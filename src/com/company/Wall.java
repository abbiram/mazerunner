package com.company;
import java.awt.*;

public class Wall extends Rectangle{

    // constructor method for Wall
    public Wall(int x, int y){
        super(x*24, y*14, 24, 14);
    }// end of Wall(int x, int y)

    // draw Wall
    public void draw(Graphics g) {
        g.fillRect(x,y,width,height);
    }// end of draw(Graphics g)

}
