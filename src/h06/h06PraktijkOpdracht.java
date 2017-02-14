package h06;

import com.sun.xml.internal.bind.v2.util.TypeCast;

import java.awt.*;
import java.applet.*;


public class h06PraktijkOpdracht extends Applet {
    double uitkomst, cijfer1, cijfer2, cijfer3, alleCijfers;
    int gemiddelde;
    //andere double gemaakt omdat ik dat makkelijker vind.
    double uitkomstDouble, antwoordDouble;



    public void init() {
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        alleCijfers = 3;
        uitkomstDouble = gemiddelde;


        uitkomst = (cijfer1 + cijfer2 +  cijfer3) / alleCijfers *10;
        gemiddelde = (int) uitkomst;
        uitkomstDouble = gemiddelde;
        antwoordDouble = uitkomstDouble /10;


    }
    //
    public void paint(Graphics g) {
        g.drawString("de uitkomst is: " + antwoordDouble,20,20);








    }

}