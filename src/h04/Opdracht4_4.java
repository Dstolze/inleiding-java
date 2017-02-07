package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.RED);
        g.fillRect(50,170,80,50);
        g.setColor(Color.BLACK);
        g.fillRect(130,80,80,140);
        g.setColor(Color.BLUE);
        g.fillRect(210,110,80,110);
        g.drawString("Valerie", 50, 230 );
        g.drawString("Jeroen", 130, 230 );
        g.drawString("Hans", 210, 230 );
        g.drawString("staafdiagram in kilo", 50, 60 );
        g.drawString("20", 10, 210 );
        g.drawString("40", 10, 180 );
        g.drawString("60", 10, 150 );
        g.drawString("80", 10, 120 );
        g.drawString("100", 10, 90 );


    }
}