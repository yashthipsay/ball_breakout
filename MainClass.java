package Brick_Breaker.src.demogame;

import java.awt.Component;

import javax.swing.JFrame;

public class MainClass{
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setTitle("Ball breakout");
        f.setSize(700, 600);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(false);

        GamePlay gameplay = new GamePlay();
        f.add(gameplay);
    }
}