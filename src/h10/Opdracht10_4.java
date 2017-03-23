package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht10_4 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst, atekst;
    int jaartal, dag, februari;
    int schrikkeljaar;
    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een jaartal en druk op enter");
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
        g.drawString(atekst, 50, 80);
        schrikkeljaar = februari +1;
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            jaartal = Integer.parseInt(s);
            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0) {
                tekst = "" + jaartal + " is een schrikkeljaar";
            }
            else {
                tekst = ""+ jaartal + " is geen schrikkeljaar";
            }
            repaint();
            s = tekstvak.getText();
                dag = Integer.parseInt(s);
                switch (dag) {
                    case 1:
                        atekst = "Januari 31 dagen";
                        break;
                    case 2:
                        atekst = "Februari 28 dagen";
                        break;
                    case 3:
                        atekst = "Maart 31 dagen";
                        break;
                    case 4:
                        atekst = "April 30 dagen";
                        break;
                    case 5:
                        atekst = "Mei 31 dagen";
                        break;
                    case 6:
                        atekst = "Juni 30 dagen";
                        break;
                    case 7:
                        atekst = "Juli 31 dagen";
                        break;
                    case 8:
                        atekst = "Augustus 31 dagen";
                        break;
                    case 9:
                        atekst = "September 30 dagen";
                        break;
                    case 10:
                        atekst = "Oktober 31 dagen";
                        break;
                    case 11:
                        atekst = "November 30 dagen";
                        break;
                    case 12:
                        atekst = "December 31 dagen";
                        break;
                    default:
                        atekst = "U hebt een verkeerd nummer ingetikt ..!";
                        break;

                }
                repaint();
            }
        }
    }



