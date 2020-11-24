package com.neutech.gui;

import com.neutech.util.FrameUtil;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUITest extends Frame {
    /*
     * 自定义生成窗口的方法*/
    public void loadFrame() {
        Frame f = new Frame();
        //设置窗口大小
        f.setSize(1900, 1000);
        //设置窗口的位置
        f.setLocation(0, 0);
        //设置窗口的可见性（默认false）
        f.setVisible(true);
        //设置窗口的不可变性(默认为true)//resizable-改变大小
        f.setResizable(false);
        //窗口关闭.添加窗口监听器
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        // 画线段
        g.drawLine(100, 200, 200, 500);
        // 画矩形
        g.drawRect(100, 100, 400, 280);
        //画圆形
        g.drawOval(100, 100, 400, 280);
        //保存系统默认颜色
        Color c = g.getColor();
        //修改画笔颜色
        g.setColor(new Color(222, 0, 1));

        //写字符串
        g.drawString("heihei", 300, 300);
        //不规则图形
        int[] xPoints = {100, 200, 300};
        int[] yPoints = {300, 400, 300};
        g.drawPolygon(xPoints, yPoints, 3);

        //归还系统颜色
        g.setColor(c);

        //画图片对象
        g.drawImage(img, GAME_WIDTH / 2 - imgWidth / 2, GAME_HEIGHT - imgHeight / 2, null);
    }

    Image img = FrameUtil.getImage("com/neutech/img/1.jpg");

    public static final int GAME_WIDTH = 1900;
    public static final int GAME_HEIGHT = 1000;

    int imgWidth = img.getWidth(null);
    int imgHeight = img.getWidth(null);

    public static void main(String[] args) {
        new GUITest().loadFrame();
    }
}
