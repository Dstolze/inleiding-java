package h11;


import java.awt.*;
import java.applet.*;


public class Opdracht11_6 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int width = 5;
        int height = 5;
        int y = 120;
        int x = 120;
        for(teller = 0; teller < 5; teller++) {
            width += 40;
            height += 40;
            y -=20;
            x -=20;
            g.drawOval(x,y,width,height);


        }
    }
}
