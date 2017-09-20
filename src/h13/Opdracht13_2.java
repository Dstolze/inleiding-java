package h13;

import java.awt.*;
import java.applet.*;

public class Opdracht13_2 extends Applet {


    public void paint(Graphics g) {
        baksenen(g);

    }

    private void baksenen(Graphics g) {
        for (int i = 0; i < 13; i++) {

            int y1 = 65;
            int ruimte = 2;
            int hoogte = 20;
            int y = y1 + (i * (hoogte + ruimte));
            for (int col = 0; col < 7; col++) {

                int x1 = 50;
                int breedte = 50;
                int x = x1 + (col * (breedte + ruimte));

                g.setColor(Color.RED);

                g.fillRect(x, y, breedte, hoogte);
            }
        }
    }
}