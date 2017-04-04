package ToetsJava1;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeWereldTijdenApp extends Applet {
    private int Londen;
    private int Tokyo;
    private int NewYork;
    private int Sydney;
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
        knop.addActionListener(new KnopListener());
        add(knop);
    }
    public void paint(Graphics g) {
        if (geklikt) {
        g.drawString("Tijd in Londen:" + Londen, 50, 50);
        g.drawString("Tijd in Tokyo:" + Tokyo , 50, 70);
        g.drawString("Tijd in New York:" + NewYork, 50, 90);
        g.drawString("Tijd in Sydney:" + Sydney, 50, 110);}
        g.drawString(fout ,50, 130);
    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int invoer = Integer.parseInt(tekstvak.getText());
            if (invoer < 25) {
// ik gebruik if statements zodat de tijd in de 23 uur blijft
// Londen tijden
                Londen = invoer -1;
                if (Londen <0)
                    Londen = 23;
// Tokyo tijden
                Tokyo = invoer +7;
                if (invoer == 18)  Tokyo = 1;
                if (invoer == 19)  Tokyo = 2;
                if (invoer == 20)  Tokyo = 3;
                if (invoer == 21)  Tokyo = 4;
                if (invoer == 22)  Tokyo = 5;
                if (invoer == 23)  Tokyo = 6;
                if (invoer == 0)  Tokyo = 7;
// New York tijden
                NewYork = invoer -6;
                if (invoer == 0)  NewYork = 18;
                if (invoer == 1)  NewYork = 19;
                if (invoer == 2)  NewYork = 20;
                if (invoer == 3)  NewYork = 21;
                if (invoer == 4)  NewYork = 22;
                if (invoer == 5)  NewYork = 23;
                if (invoer == 6)  NewYork = 0;
// Sydney tijden
                Sydney = invoer + 9;
                if (invoer == 15)  Sydney = 0;
                if (invoer == 16)  Sydney = 1;
                if (invoer == 17)  Sydney = 2;
                if (invoer == 18)  Sydney = 3;
                if (invoer == 19)  Sydney = 4;
                if (invoer == 20)  Sydney = 5;
                if (invoer == 21)  Sydney = 6;
                if (invoer == 22)  Sydney = 7;
                if (invoer == 23)  Sydney = 8;
                if (invoer == 0)  Sydney = 9;
            }
            else {
                fout = "Verkeer Getal Ingevoerd";
            }
            repaint();
        }
    }
        class KnopListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!geklikt) {
                    geklikt = true;
                }
            }
        }
}












