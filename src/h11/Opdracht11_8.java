package h11;


import java.awt.*;
import java.applet.*;


public class Opdracht11_8 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int width = 5;
        int height = 5;
        int y = 500;
        int x = 500;
        for(teller = 0; teller < 100; teller++) {
            width += 10;
            height += 10;
            y -=10;
            x -=0;
            g.drawOval(x,y,width,height);

        }
    }
}

