package h05;
/*
gemaakt door Dave Stolze
 */

import java.applet.Applet;
import java.awt.*;

import java.awt.*;
import java.applet.*;

public class Opdracht5_2 extends Applet {

    int Valerie;
    int Jeroen;
    int Hans;
    int nulpunt, yas_Valerie, yas_Jeroen, yas_Hans;

    public void init() {
        Valerie = 40;
        Jeroen = 100;
        Hans = 80;

        nulpunt=180;
        yas_Valerie = nulpunt - Valerie;
        yas_Hans = nulpunt - Hans;
        yas_Jeroen = nulpunt - Jeroen;
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.drawString("Valerie", 60, 200);
        g.fillRect(50,yas_Valerie, 50, Valerie);
        g.setColor(Color.green);
        g.drawString("Jeroen", 110, 200);
        g.fillRect(100,yas_Jeroen,50,Jeroen);
        g.setColor(Color.blue);
        g.drawString("Hans", 160, 200);
        g.fillRect(150,yas_Hans,50,Hans);

        g.setColor(Color.black);
        g.drawString("0", 30, 210);
        g.drawString("20", 25, 160);
        g.drawString("40", 25, 140);
        g.drawString("60", 25, 120);
        g.drawString("80", 25, 100);
        g.drawString("100", 18, 80);
        g.drawString("120", 17, 60);
        g.drawLine(40,180,40,40);


    }
}
