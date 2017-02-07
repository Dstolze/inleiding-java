package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.BLACK);
        g.drawRect(30,80,150,30);
        g.drawRect(30,110,150,30);
        g.drawRect(30,140,150,30);
        g.drawRect(20,80,10,280);
        g.setColor(Color.RED);
        g.fillRect(30,80,150,30);
        g.setColor(Color.WHITE);
        g.fillRect(30,110,150,30);
        g.setColor(Color.BLUE);
        g.fillRect(30,140,150,30);
        g.setColor(Color.WHITE);
        g.fillRect(20,80,10,280);
    }
}
