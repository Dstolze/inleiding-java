package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRoundRect(20,20,65,180,120,50);
        g.fillRoundRect(20,20,65,180,120,50);
        g.setColor(Color.RED);
        g.drawOval(32,40,40,40);
        g.fillOval(32,40,40,40);
        g.setColor(Color.ORANGE);
        g.drawOval(32,90,40,40);
        g.fillOval(32,90,40,40);
        g.setColor(Color.GREEN);
        g.drawOval(32,140,40,40);
        g.fillOval(32,140,40,40);
        g.setColor(Color.BLACK);
        g.fillRect(40,190,20,110);
    }
}