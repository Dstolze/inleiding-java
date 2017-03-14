package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht8_3 extends Applet {
    TextField tekstvak;
    Label label;
    double getal;
    double getaldelen;
    double getalbtw;
    double fullgetal;
    Button knopTest;
    double alles;

    public void init() {

        getalbtw = 21;
        getaldelen = 100;
        tekstvak = new TextField("", 20);
        label = new Label("Typ uw getal zonder BTW");
        tekstvak.addActionListener(new TekstvakListener());
        add(label);
        add(tekstvak);

        knopTest = new Button();
        knopTest.setLabel("Ok");
        TekstvakListener ll = new TekstvakListener();
        knopTest.addActionListener( ll );
        add(knopTest);

    }

    public void paint(Graphics g) {
        g.drawString("Het getal is inclusief BTW is " + alles, 50, 60);
        fullgetal = getal / getaldelen * getalbtw;
        alles = fullgetal + getal;


    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s);
            repaint();
        }

        class KnopListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                getal = 0;
                repaint();
            }
        }
    }
}