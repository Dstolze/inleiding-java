package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Opdracht13_3 extends Applet {

    int X = 15;
    int Y = 10;
    int breedte = 50;
    int hoogte = 20;
    int ruimte = 2;
    Button brick;
    boolean brickbutton = false;

    int XBlok = 800;
    int YBlok = 10;
    int breedteBlok = 60;
    int hoogteBlok = 30;
    int ruimteBlok = 2;
    Button betonblok;
    boolean betonButton = false;


    public void init() {

        button();

    }



    public void paint(Graphics g) {

        if (brickbutton == true) {

            bakstenen(g);

            betonButton = false;

        }



        if (betonButton == true) {

            betonblokken(g);

            brickbutton = false;

        }

    }



    public void button() {

        brick = new Button("Baksteen");

        add(brick);

        brick.addActionListener(new KnopListener());



        betonblok = new Button("Betonblok");

        add(betonblok);

        betonblok.addActionListener(new KnopListener1());

    }



    public void bakstenen(Graphics g) {

        for (int i = 0; i < 13; i++) {

            int y = Y + (i * (hoogte + ruimte));

            for (int col = 0; col < 7; col++) {

                int x = X + (col * (breedte + ruimte));

                g.setColor(Color.RED);

                g.fillRect(x, y, breedte, hoogte);

            }

        }

    }



    public void betonblokken(Graphics g) {

        for (int i = 0; i < 9; i++) {

            int y = YBlok + (i * (hoogteBlok + ruimteBlok));

            for (int col = 0; col < 7; col++) {

                int x = XBlok + (col * (breedteBlok + ruimteBlok));

                g.setColor(Color.gray);

                g.fillRect(x, y, breedteBlok, hoogteBlok);



            }

        }

    }



    class KnopListener implements ActionListener {



        public void actionPerformed(ActionEvent e) {

            brickbutton = true;

            if (brickbutton == true) {

                betonButton = false;

            }

            repaint();

        }

    }



    class KnopListener1 implements ActionListener {



        public void actionPerformed(ActionEvent e) {

            betonButton = true;

            if (betonButton == true) {

                brickbutton = false;



            }

            repaint();

        }

    }

}
