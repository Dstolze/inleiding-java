package h11;

import java.awt.*;
import java.applet.*;


public class Opdracht11_5 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 10;
        int x = 10;
        for(teller = 0; teller < 5; teller++) {
            y += 40;
            x += 40;
        g.drawRect(x,y,40,40);


        }
    }
}