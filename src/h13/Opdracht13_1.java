package h13;

import java.applet.Applet;
import java.awt.*;


public class Opdracht13_1 extends Applet {

    public void init () {

    }

    public void paint(Graphics g) {
        tekendriehoek(g, 10, 80, 20, 40, 30,60);
    }

    private void tekendriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.drawLine(10, 10,20,20);
        g.drawLine(20,20,30,30);
        g.drawLine(30,30,10,10);

    }
}
