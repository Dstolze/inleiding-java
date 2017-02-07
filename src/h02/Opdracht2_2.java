package h02;

import java.awt.*;
import java.applet.*;


public class Opdracht2_2 extends Applet {

    public void init() {
        setBackground(Color.WHITE);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Dave", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Stolze", 50, 80 );

    }

}