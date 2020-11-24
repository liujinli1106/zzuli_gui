package com.neutech.gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUITest1 extends Frame {

    public void loadFrame() {
        this.setSize(1000, 700);
        this.setLocation(0, 0);
        this.setVisible(true);
        this.setResizable(false);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new GUITest1().loadFrame();
    }
}
