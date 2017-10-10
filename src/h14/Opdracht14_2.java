package h14;

import java.applet.Applet;
import java.awt.*;
import java.util.Random;

public class Opdracht14_2 extends Applet {

    //hier maak je de kaarten

    private String[] deck = new String[52]; // de hoeveelheid kaarten
    private String[] p = {"Harten", "Klaver", "Ruiten", "Schoppen"};
    private String[] r = {"Aas", "twee", "drie", "vier", "5", "6", "7", "8", "9", "10", "Boer", "Koning", "Koningin"};
    private String[] speler1;
    private String[] speler2;
    private String[] speler3;
    private String[] speler4;


    public void init() {

        speler1 = new String[13];
        speler2 = new String[13];
        speler3 = new String[13];
        speler4 = new String[13];

        deck = new String[52];
        Double r = Math.random();

        int index = 0;

        for (int i = 0; i < p.length; i++) {
            String[] p = new String[0];
            for (int j = 0; j < this.r.length; j++) {
                deck[index] = p[i] + this.r[j];
                index += 1;

            }
        }
        for (int i = 0; i <13 ; i++) {
            speler1[i] = deelKaart();
            speler2[i] = deelKaart();
            speler3[i] = deelKaart();
            speler4[i] = deelKaart();
        }
    }
    private String deelKaart() {

        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];
        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }

    public void paint(Graphics g) {

        double r = Math.random();
        int kaarten = (int) (r * deck.length);
        for (int i = 0; i <13 ; i++) {
            int y = 100;
            g.drawString("Speler 1", 50, 40);
            g.drawString(speler1[i],50,y + 20 *i);
            g.drawString("Speler 2", 250, 40);
            g.drawString(speler2[i],250,y + 20 *i);
            g.drawString("Speler 3", 450, 40);
            g.drawString(speler3[i],450,y + 20 *i);
            g.drawString("Speler 4", 650, 40);
            g.drawString(speler4[i],650,y + 20 *i);

        }
    }

}


