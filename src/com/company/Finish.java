package com.company;
import javax.swing.*;
import java.awt.*;

public class Finish extends Rectangle{
    ImageIcon image;

    // constructor method
    public Finish(int x, int y){
        super(x*24, y*14, 24, 14);
        image = new ImageIcon("block3.png");
    }

    // draw image
    public void draw(Graphics g) {
        g.drawImage(image.getImage(), x, y, width, height, null);
    }

}

