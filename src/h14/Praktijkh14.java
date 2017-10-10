package h14;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Praktijkh14 extends Applet {

    private int computerzet;
    private int spelerzet;
    private int smileys = 23;
    private String winaar;
    private Button knop;
    private TextField tekstvak;
    private Image afbeelding;
    private Image afbeelding2;
    private boolean beurt = true;

    public void init() {
        tekstvak = new TextField("",15);
        knop = new Button("Zet");
        add(tekstvak);
        add(knop);
        URL pad = Praktijkh14.class.getResource("/resources/");
        afbeelding = getImage(pad, "illu.jpg");
        tekstvak.addActionListener(new spelTextListener());
        knop.addActionListener(new spelTextListener());
    }
    public void paint(Graphics g) {

        setSize(700,500);
        g.setColor(Color.blue);
        g.drawImage(afbeelding2, 0, 0, 700, 500, this);
        g.setColor(Color.black);

        if (smileys > 0) {
            int x = 50;
            int y = 50;
            for (int i = 0; i < smileys; i++) {
                g.drawImage(afbeelding, x, y, 55, 55, this);
                x += 55;
                if (i % 4 == 3) {
                    x = 50;
                    y += 55;
                }
            }
            g.drawString("Laatste zet speler " + spelerzet, 370, 300);
            g.drawString("Laatste zet computer " + computerzet, 370, 320);
        }
        else{
            g.drawString(winaar,20,100);
        }
        if (beurt) {
        }
    }

    private int smileys() {

        int take = 0;
        double r;
        int r2;
        r = Math.random();
        r2 = (int) (r * 3 + 1);

        int spelerzet;
        spelerzet = smileys % 4;

        if (spelerzet == 0) {
            take = 3;
        }
        if (spelerzet == 1) {
            take = r2;
        }
        if (spelerzet == 2) {
            take = 1;
        }
        if (spelerzet == 3) {
            take = 2;
        }
        return take;

    }

    private class spelTextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String smiley = tekstvak.getText();
            int spelertussenstap = Integer.parseInt(smiley);
            if (spelertussenstap < 4 && spelertussenstap > 0) {

                spelerzet = spelertussenstap;
                smileys -= spelerzet;
                if (smileys < 1) {
                    winaar = "je hebt verloren";
                    URL pad = Praktijkh14.class.getResource("/resources/");
                    afbeelding2 = getImage(pad, "gameover.jpg");

                } else {

                    computerzet = smileys();
                    smileys -= computerzet;
                    if (smileys < 0) {
                        winaar = "je hebt gewonnen";
                        URL pad = Praktijkh14.class.getResource("/resources/");
                        afbeelding2 = getImage(pad, "ali.jpg");
                    }
                }
            } else {
                beurt = false;
            }
            repaint();
        }
    }
}

