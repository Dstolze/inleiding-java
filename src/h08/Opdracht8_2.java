package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;



public class Opdracht8_2 extends Applet {
    Button knop;
    Button knopm;
    Button knopv;
    Button knoppm;
    Button knoppv;
    int alles;
    int mannen = 0;
    int vrouwen;
    int pm;
    int pv;

    public void init() {
        setBackground(Color.white);
        mannen = 0;
        {

            knopm = new Button();
            knopm.setLabel("mannen");
            KnopListenerm aa = new KnopListenerm();
            knopm.addActionListener(aa);
            add(knopm);

            knopv = new Button();
            knopv.setLabel("vrouwen");
            add(knopv);
            KnopListener2 bb = new KnopListener2();
            knopv.addActionListener(bb);

            knoppm = new Button();
            knoppm.setLabel("Potentiële mannen");
            KnopListener3 cc = new KnopListener3();
            knoppm.addActionListener(cc);
            add(knoppm);

            knoppv = new Button();
            knoppv.setLabel("potentiële vrouwen");
            KnopListener4 dd = new KnopListener4();
            knoppv.addActionListener(dd);
            add(knoppv);

        }
    }

    public void paint(Graphics g) {
        alles = vrouwen + mannen + pm + pv;
        g.drawString("vrouwen: " + vrouwen, 10, 70);
        g.drawString("mannen: " + mannen, 10, 55);
        g.drawString("potentiële mannen: " + pm, 10, 85);
        g.drawString("potentiële vrouwen: " + pv, 10, 100);
        g.drawString("Totaal: " + alles, 10, 120);
    }

    class KnopListenerm implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mannen++;
            repaint();
        }

    }

    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouwen++;
            repaint();
        }

    }

    class KnopListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            pm++;
            repaint();
        }
    }

    class KnopListener4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            pv++;
            repaint();
        }
    }
}