package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;


public class Opdracht10_1 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int HoogsteGetal, LaagsteGetal;
    Button knop;
    int invoer;

    public void init() {
        tekstvak = new TextField("", 5);
        tekst = "OK";
        add(tekstvak);

        knop = new Button();
        knop.setLabel("ok");
        tekstvak.addActionListener(new VakListener());
        add (knop);
    }


    public void paint(Graphics g) {
        g.drawString("" + invoer, 50, 70);
    }

        class VakListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                invoer = Integer.parseInt(tekstvak.getText());
                if((invoer > HoogsteGetal)) {
                    HoogsteGetal = invoer;
                    repaint();
                }

            }
        }
    }








