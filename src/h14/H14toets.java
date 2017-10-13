package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class H14toets extends Applet {
    boolean win;
    boolean win2;
    Button speelknop;
    Button crediet;
    int krediet = 10;
    Image[] fotos = new Image[20];
    URL imagePad;

    int spel1 = (int) (Math.random() * 20);
    int spel2 = (int) (Math.random() * 20);
    int spel3 = (int) (Math.random() * 20);

    public void init() {
        setSize(400,600);
        imagePad = H14toets.class.getResource("/resources/");
        for (int i = 0; i < fotos.length; i++) {
            fotos[i] = getImage(imagePad, "fruit_" + (i + 1) + ".jpg");
        }
        win = false;
        speelknop = new Button("Speel");
        speelknop.addActionListener(new speelListener());
        crediet = new Button("Koop 10 kredietpunten");
        crediet.addActionListener(new KredietListener());
        add(speelknop);
        add(crediet);
    }
    public void paint(Graphics g) {
        g.drawImage(fotos[spel1], 30, 80, this);
        g.drawImage(fotos[spel2], 100, 80,this);
        g.drawImage(fotos[spel3], 170, 80, this);
        g.drawString("krediet" + krediet, 40, 300);
        if (win == true) ;
        {
            g.drawString("Gewonnen: 4 punten! ", 40, 350);
            win = false;
        }
        if (win2 == true)
        {
            g.drawString("Gewonnen: 20 punten! ", 40, 350);
            win2 = false;
        }
    }
    class speelListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
             spel1 = (int) (Math.random() * 20);
             spel2 = (int) (Math.random() * 20);
             spel3 = (int) (Math.random() * 20);
            if (spel1 == spel2 || spel2 == spel3 || spel1 == spel3) {
                krediet += 4;
                win = true;
            }
            if (spel1 == spel2 && spel2 == spel3) {
                krediet += 20;
                win2 = true;
            }
                else if (krediet == 1) {
                speelknop.setEnabled(false);
                crediet.setEnabled(true);
                krediet--;
            }
            else { krediet--; }

            repaint();
        }
    }
    class KredietListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        krediet = 10;
        speelknop.setEnabled(true);
        crediet.setEnabled(false);
        repaint();
        }
    }
}




