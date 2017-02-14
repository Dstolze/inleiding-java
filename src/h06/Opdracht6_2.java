package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht6_2 extends Applet {
    int seconden;
    int minuut;
    int ABuitkomst;
    int uurSeconden;
    int dag;
    int CDuitkomst;
    int dagSeconden;
    int jaar;
    int dagjaaruitkomst;


    public void init() {
        seconden = 60;
        minuut = 60;
        ABuitkomst = seconden*minuut;
        uurSeconden = 3600;
        dag = 24;
        CDuitkomst = uurSeconden*dag;
        dagSeconden = 86400;
        jaar = 365;
        dagjaaruitkomst = dagSeconden*jaar;

    }

    public void paint(Graphics g) {
        g.drawString("Aantal seconden in een uur " + ABuitkomst, 20, 20);
        g.drawString("Aantal seconden in een dag " + CDuitkomst, 20, 35);
        g.drawString("Aantal seconden in een jaar " + dagjaaruitkomst, 20, 50);


    }




}
