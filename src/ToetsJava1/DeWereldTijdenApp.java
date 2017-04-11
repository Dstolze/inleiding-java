package ToetsJava1;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeWereldTijdenApp extends Applet {
    private int londen;
    private int tokyo;
    private int newYork;
    private int sydney;
    private TextField tekstvak;
    private String fout;
    private boolean geklikt;

    public void init() {
        tekstvak = new TextField("", 20);
        Label label = new Label("Voer uw uur in");
        add(label);
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);
        Button knop = new Button();
        knop.setLabel("Toon Tijden");
        knop.addActionListener(new TekstvakListener());
        add(knop);
    }

    public void paint(Graphics g) {
        if (geklikt) {
            g.drawString("Tijd in londen:" + londen, 50, 50);
            g.drawString("Tijd in Tokyo:" + tokyo, 50, 70);
            g.drawString("Tijd in New York:" + newYork, 50, 90);
            g.drawString("Tijd in sydney:" + sydney, 50, 110);
        }
        g.drawString(fout, 50, 130);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int invoer = Integer.parseInt(tekstvak.getText());
            if (invoer < 24) {
                if (!geklikt) {
                    geklikt = true;
                }
// ik gebruik if statements zodat de tijd in de 23 uur blijft
// londen tijden
                londen = invoer - 1;
                if (londen < 24)
// Tokyo tijden
                    tokyo = invoer + 7;
                if (tokyo > 24)
                    tokyo = tokyo - 24;
// New York tijden
                newYork = invoer - 6;
                if (newYork <0)
                    newYork = newYork + 24;
// sydney tijden
                sydney = invoer + 9;
                if (sydney > 24)
                    sydney = sydney - 24;
            } else {
                fout = "Verkeer Getal Ingevoerd";
            }
            repaint();
        }
    }
}














