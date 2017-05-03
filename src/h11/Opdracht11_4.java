package h11;

import java.awt.*;
import java.applet.*;


public class Opdracht11_4 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int startAt = 3;
        int y =0;

        for (int i = startAt; i <= 31; i += 3) {
            for (int j = startAt; j <= 31; j += 3) {

                y +=20;
                g.drawString("tafel " + i, 305, y);
            }
        }
    }
}
