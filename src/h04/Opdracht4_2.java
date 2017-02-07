package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRect(40, 80, 180, 100);
        g.fillRect(60, 140, 20, 40);
        g.fillRect(140, 120, 20, 20);
        g.drawPolygon(new int[] {40, 125, 220}, new int[] {80, 30, 80}, 3);
    }
}