import java.io.BufferedReader;
import java.util.Scanner;

/**
 * Created by dani on 5/8/17.
 */
public class Punkt {


    double xKoordinate;
    double yKoordinate;


    public Punkt() {
        xKoordinate = 0.;
        yKoordinate = 0.;
    }

    public double berechneAbstandVomNullpunkt() {
        double abstand;
        abstand = Math.sqrt(Math.pow(this.xKoordinate, 2) + Math.pow(this.yKoordinate, 2));
        return (abstand);
    }

    public double berechneAbstandZuPunkt(Punkt punkt) {
        double abstand;
        abstand = Math.sqrt(Math.pow(this.xKoordinate - punkt.xKoordinate, 2) +
                Math.pow(this.yKoordinate - punkt.yKoordinate, 2));
        return (abstand);
    }

    public Punkt verschiebeUm(double strecke, double richtung) {
        Punkt neuerPunkt;
        double xDelta;
        double yDelta;

        neuerPunkt = new Punkt();
        xDelta = strecke * Math.cos(richtung / 180 * Math.PI);
        yDelta = strecke * Math.sin(richtung / 180 * Math.PI);
        neuerPunkt.xKoordinate = this.xKoordinate + xDelta;
        neuerPunkt.yKoordinate = this.yKoordinate + yDelta;
        return (neuerPunkt);
    }

    public void gibWerteAus(){
        System.out.println("xCords: " + this.xKoordinate);
        System.out.println("yCords: " + this.yKoordinate);
    }

    public void leseWerteUeberTastatur(){
        System.out.println("Insert x: ");
        Scanner in = new Scanner(System.in);
        this.xKoordinate = in.nextDouble();
        System.out.println("Insert y: ");
        this.yKoordinate = in.nextDouble();

    }

    public double berechneFlaeche(Punkt p2, Punkt p3){
        double deltaX12 = p2.xKoordinate - this.xKoordinate;
        double deltaX13 = p3.xKoordinate - this.xKoordinate;
        double deltaY12 = p2.yKoordinate - this.yKoordinate;
        double deltaY13 = p3.yKoordinate - this.yKoordinate;


        return (1/2) * (deltaX12 * deltaY13 - deltaX13 * deltaY12);
    }
}
