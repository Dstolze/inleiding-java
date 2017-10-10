package h14;

import java.applet.Applet;
import java.awt.*;

import static java.lang.Math.*;


public class Opdracht14_1 extends Applet {
    //hier maak je de kaarten
    int[] deck = new int[52]; // de hoeveelheid kaarten
    String[] klasse = {"Harten", "Klaver", "Ruiten", "Schoppen"};
    String[] nummers = {"Aas", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Boer", "Koning", "Koningin"};

    public void init() {

        for (int i = 0; i < deck.length; i++) {
            int index = (int) (random() * deck.length);
            int x = deck[i];
            deck[i] = deck[index];
            deck[index] = x;

        }
    }


    public void paint(Graphics g) {
        for (int i = 0; i < 4; i++) {
            String suit = klasse[deck[i] / 52];
            String nummer = nummers[deck[i] / 52];

            g.drawString("je hebt de " + nummer + " van " + suit, 80, 80);
        }
    }
}

