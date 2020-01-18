package com.company;

import javax.swing.*;
import java.awt.*;

public class Bullet extends Rectangle{


    // declare fields and variables of Bullet
   int w, h;
            int vx,vy;
    ImageIcon image;

    // constructor of Bullet
    public Bullet(int x, int y, int w, int h, int vx, int vy) {
        // initialize variables of Bullet
        super(x, y, w, h);

        this.w = w;
        this.h = h;
        this.vx= vx;
        this.vy = vy;
        image = new ImageIcon("asad.JPG");
    }

    // draw bullet
    public void draw(Graphics g) {
        g.drawImage(image.getImage(), x, y, w, h, null);
    }

    // move bullet
    public void move(){
        x += vx * 2;
        y += vy * 2;
    }
}
