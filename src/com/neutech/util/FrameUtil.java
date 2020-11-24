package com.neutech.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 * 项目中资源加载（图片，声音）
 */
public class FrameUtil {
    public static Image getImage(String imgPath){
        //通过反射机制将资源路径下的资源转换成为字节码加载到内存中
        URL u=FrameUtil.class.getClassLoader().getResource(imgPath);
        BufferedImage img=null;
        //通过io流读取
        try {
           img= ImageIO.read(u);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;

    }
}
