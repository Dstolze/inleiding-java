package h05;


import java.awt.*;
import java.applet.*;

public class Opdracht5_1 extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int breedte, hoogte, eerste, tweede, derde, onder, boven;


    public void init() {
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 120;
        hoogte = 70;
        eerste = 10;
        tweede = 150;
        derde = 300;
        onder = 10;
        boven = 10;

    }

    public void paint(Graphics g) {

        g.drawLine(eerste,10,130,10);
        g.drawString("Lijn", 45, 30 );
        g.drawRect(eerste,40,breedte,hoogte);
        g.setColor(Color.MAGENTA);
        g.drawRect(tweede,40,breedte,hoogte);
        g.fillRect(tweede,40,breedte,hoogte);
        g.setColor(Color.BLACK);
        g.drawOval(tweede,40,breedte,hoogte);
        g.setColor(Color.magenta);
        g.fillArc(derde,40,100,80,5,35);
        g.setColor(Color.BLACK);
        g.drawOval(280,40,breedte,hoogte);
        g.drawString("Rechthoek", 35, 125 );
        g.drawString("Gevulde rechthoek met ovaal", 120, 125 );
        g.drawString("Taartpunt met ovaal eromheen", 280, 125 );
        g.drawRoundRect(10,130,120,70,10,10);
        g.setColor(Color.magenta);
        g.fillOval(150,130,breedte,hoogte);
        g.setColor(Color.BLACK);
        g.drawOval(derde,130,80,70);
        g.drawString("Rechthoek", 35, 215 );
        g.drawString("Gevulde ovaal", 170, 215 );
        g.drawString("Cirkel", 325, 215 );



    }
}