package com.neutech.gui;

import java.awt.*;

/**
 * 生成窗口文件
 * 1.继承frame类
 * 2.重写paint（Graphic g）
 */
public class GUITest extends Frame {

    public void loadFrame(){
        this.setSize(1000,800);
        this.setLocation(0,0);
        this.setVisible(true);
        this.setEnabled(true);
        this.setResizable(true);

    }

    public static void main(String[] args) {
        new GUITest().loadFrame();
    }
}
