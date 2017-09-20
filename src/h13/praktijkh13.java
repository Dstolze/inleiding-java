package h13;

        import java.awt.*;
        import java.applet.Applet;

public class praktijkh13 extends Applet {
    int x = 75;
    int y = 75;
    int yy = 135;
    int xx = 98;
    public void init() {
        setSize(800, 600);
    }


    public void paint(Graphics g) {
for (int eersterij = 0; eersterij < 5; eersterij++) {
for (int tweederij = 0; tweederij < 2; tweederij++) {
tekenboom(g, eersterij * 100 + 10 * (tweederij % 2), (tweederij + 5) * 20);
tekenboom(g, eersterij * 100 + 10 * (tweederij % 2), (tweederij + 5) * 20);

}
        } }

void tekenboom(Graphics g, int x, int y) {
    g.setColor(Color.green);
    g.fillOval(x, y, 60, 60);
    g.setColor(Color.black);
    g.drawOval(x, y, 60, 60);
    // boomstam.
    g.setColor(new Color(80, 80, 0));
    g.fillRect(xx, yy, 15, 90);
}

}
