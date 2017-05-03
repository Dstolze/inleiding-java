package h11;

import java.awt.*;
import java.applet.*;


public class Opdracht11_7 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int width = 5;
        int height = 5;
        int y = 500;
        int x = 500;
        for(teller = 0; teller < 50; teller++) {
            width += 20;
            height += 20;
            y -=10;
            x -=10;
            g.drawOval(x,y,width,height);

        }
    }
}