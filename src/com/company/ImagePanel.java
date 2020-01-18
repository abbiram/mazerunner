package com.company;
import java.awt.*;
import javax.swing.*;

public class ImagePanel extends JPanel {
    private Image img;

    public ImagePanel(String img){
        this(new ImageIcon(img).getImage());
    }

    public ImagePanel(Image img){
        this.img = img;
        setBackground(Color.black);
        setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
    }

    public void paintComponent(Graphics g){
        g.drawImage(img, 0, 0, null);
    }
}
