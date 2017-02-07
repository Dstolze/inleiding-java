package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.YELLOW);
        g.drawOval(20,20,50,100);
        g.fillOval(20,20,50,100);

    }
}