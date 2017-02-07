package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawPolygon(new int[] {40, 60, 80}, new int[] {120, 20, 120}, 3);
    }
}
