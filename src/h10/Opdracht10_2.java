package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;


public class Opdracht10_2 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    Button knop;
    int invoer;
    int HoogsteGetal = Integer.MIN_VALUE;
    int LaagsteGetal = Integer.MAX_VALUE;

    public void init() {
        HoogsteGetal = Integer.MIN_VALUE;
        LaagsteGetal = Integer.MAX_VALUE;
        tekstvak = new TextField("", 5);
        tekst = "OK";
        add(tekstvak);

        knop = new Button();
        knop.setLabel("ok");
        tekstvak.addActionListener(new VakListener());
        add(knop);


    }


    public void paint(Graphics g) {
        g.drawString("" + HoogsteGetal, 50, 70);
        g.drawString("" + LaagsteGetal, 50, 90);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            invoer = Integer.parseInt(tekstvak.getText());
            repaint();
            if ((invoer < LaagsteGetal)) {
                LaagsteGetal = invoer;
                repaint();
            if ((invoer > HoogsteGetal)) {
                HoogsteGetal = invoer;
                repaint();



                }

            }
        }
    }
}

