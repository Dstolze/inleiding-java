package h13;

        import java.awt.*;
        import java.applet.Applet;

public class praktijkh13 extends Applet {
    int x = 75;
    int y = 75;
    public void init() {
        setSize(800, 600);
    }


    public void paint(Graphics g) {
for (int headloop = 0; headloop < 5; headloop++) {
for (int secondloop = 0; secondloop < 2; secondloop++) {
tekenboom(g, headloop * 80 + 20 * (secondloop % 2), (secondloop + 5) * 40);
x+=80;
y+=80;
}
        } }

void tekenboom(Graphics g, int x, int y) {
    g.setColor(Color.green);
    g.fillOval(x, y, 60, 60);
    g.setColor(Color.black);
    g.drawOval(x, y, 60, 60);
    // boomstam.
    g.setColor(new Color(80, 80, 0));
    g.fillRect(98, 135, 15, 90);
}

}

    /**
    public void paint(Graphics g) {
        int eersterij = 0;
        int tweederij = 0;
        int y = 40;
        int x = 40;


        int headloop = 0;
        int secondloop = 0;
        tekenboom(g, headloop * 80 + 20 * (secondloop % 2), (secondloop + 5) * 40);
        tekenboom(g, headloop * 80 + 20 * (secondloop % 2), (secondloop + 5) * 40);
        for (headloop = 0; headloop < 6; headloop++) {
            for (secondloop = 0; secondloop < 3; secondloop++) ;
        }

        {
            {


        private void tekenboom (Graphics g,int i, int i1){
            g.setColor(Color.green);
            g.fillOval(75, 75, 60, 60);
            g.setColor(Color.black);
            g.drawOval(75, 75, 60, 60);
            // boomstam.
            g.setColor(new Color(80, 80, 0));
            g.fillRect(98, 135, 15, 90);
        }
    }
     */