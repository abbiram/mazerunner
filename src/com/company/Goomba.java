package com.company;
        import javax.swing.*;
        import java.awt.*;

public class Goomba extends Rectangle{
    ImageIcon image;

    // constructor for Goomba
    public Goomba(int x, int y){
        super(x*24, y*14, 24, 14);
        image = new ImageIcon("Goomba.png");
    }

    // draw Goomba image
    public void draw(Graphics g) {
        g.drawImage(image.getImage(), x, y, width, height, null);
    }



}
