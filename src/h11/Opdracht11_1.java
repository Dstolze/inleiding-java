package h11;

import java.awt.*;
import java.applet.*;


public class Opdracht11_1 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 0; teller < 11; teller++) {
            y += 20;
            g.drawLine(50 , y, 300, y );
        }
    }
}