/*
package com.company;

import javax.swing.*;
import java.awt.*;


public class Ghost extends Rectangle {


    ImageIcon image;
    int x, y, randomVx, randomVy, health;
    boolean bounceBack;
    static boolean up = false;
    static  boolean down = true;

    public Ghost(int x, int y) {
        super(x, y, 19, 19);
        image = new ImageIcon("Ghost.png");
        this.x = x;
        this.y = y - 7;

        health = 100;
        randomVx = (int) (Math.random() * 2) + 1;
        randomVy = (int) (Math.random() * 2) + 1;
    }


    public void draw(Graphics g) {
        g.drawImage(image.getImage(), x, y, 20, 20, null);
        g.setColor(Color.white);
        //g.fillRect(x, y - 20, 30, 5);
    }

    public void move() {
        if (down) {

            bounceUp();


        } else if (up) {
            bounceDown();

        }else{
            super.y = super.y + 1;
            this.y = super.y;
            up = false;
            down = true;
        }


    }

    public void bounceBack() {
        if (!up){
            up = true;
            down = false;
        }
        else{
            up = false;
            down = true;
        }
        super.y = super.y - 1;
        this.y = super.y - 1;

    }



    public void bounceUp(){
        super.y = super.y - 1;
        this.y = super.y - 1;
        up = true;
        down = false;

    }

    public void bounceDown(){
        super.y = super.y + 1;
        this.y = super.y + 1;
        up = false;
        down = true;
    }



}

*/
