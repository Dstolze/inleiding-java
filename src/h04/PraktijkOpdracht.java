package h04;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(10,10,130,10);
        g.drawString("Lijn", 45, 30 );
        g.drawRect(10,40,120,70);
        g.setColor(Color.MAGENTA);
        g.drawRect(150,40,120,70);
        g.fillRect(150,40,120,70);
        g.setColor(Color.BLACK);
        g.drawOval(150,40,120,70);
        g.setColor(Color.magenta);
        g.fillArc(300,40,100,80,5,35);
        g.setColor(Color.BLACK);
        g.drawOval(280,40,120,70);
        g.drawString("Rechthoek", 35, 125 );
        g.drawString("Gevulde rechthoek met ovaal", 120, 125 );
        g.drawString("Taartpunt met ovaal eromheen", 280, 125 );
        g.drawRoundRect(10,130,120,70,10,10);
        g.setColor(Color.magenta);
        g.fillOval(150,130,120,70);
        g.setColor(Color.BLACK);
        g.drawOval(300,130,80,70);
        g.drawString("Rechthoek", 35, 215 );
        g.drawString("Gevulde ovaal", 170, 215 );
        g.drawString("Cirkel", 325, 215 );
    }
}