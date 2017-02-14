package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht6_3 extends Applet {
    int a;
    int b;
    int uitkomst;

    public void init() {
        a = 1;
        b = 1;
        uitkomst = a+b;
    }

    public void paint(Graphics g) {
        uitkomst--;
        uitkomst--;
        g.drawString("Positieve waarden naar negetief " + uitkomst, 50, 60 );
    }
}
