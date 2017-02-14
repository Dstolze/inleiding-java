package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht6_1 extends Applet {
    double totaal,delen;
    double uitkomst;

    public void init() {
        totaal = 113;
        delen = 4;
        uitkomst = totaal/delen;

    }

    public void paint(Graphics g) {
        g.drawString("Jan € " + uitkomst, 20, 20);
        g.drawString("Ali € " + uitkomst, 20, 35);
        g.drawString("Jeannette € " + uitkomst, 20, 50);
        g.drawString("Dave € " + uitkomst, 20, 65);

    }

}