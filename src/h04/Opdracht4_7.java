package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRect(100,100,100,100);
        g.drawOval(110,120,20,20);
        g.fillOval(110,120,20,20);
        g.drawOval(165,120,20,20);
        g.fillOval(165,120,20,20);
        g.drawOval(165,165,20,20);
        g.fillOval(165,165,20,20);
        g.drawOval(110,165,20,20);
        g.fillOval(110,165,20,20);

    }
}