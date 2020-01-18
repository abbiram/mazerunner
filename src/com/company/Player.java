package com.company;

import javax.swing.*;
import java.awt.*;

public class Player extends Rectangle{

    // declare fields and variables of Player
    int  vx, vy;
    int health;
    int damage;
    ImageIcon image;

    // constructor method
    public Player(int x, int y, int w, int h) {
        // initialize all fields
        super(x, y, w, h);
        image = new ImageIcon("asad.JPG");
        vx = 0;
        vy = 0;
        health = 30;
        damage = 0;
    }


// draw Player
    public void draw(Graphics g) {
        g.drawImage(image.getImage(), x, y, width, height, null);
        g.setColor(Color.green);
        g.fillRect(x, y-10, health, 5);
        g.setColor(Color.red);
        g.fillRect(x+ health, y-10, damage, 5);
    }

    // move player
    public void move(){
        x += vx;
        y += vy;
    }
}
