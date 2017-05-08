/**
 * Created by dani on 5/8/17.
 */
public class BeispielNeu {
    public static void main(String[] args) {
        Punkt punkt1 = new Punkt(); // Instanz der Klasse Punkt erzeugen
        punkt1.xKoordinate = 3.;    // Koordinaten belegen
        punkt1.yKoordinate = 4.;
        punkt1.gibWerteAus();       // Ausgabe der Werte mit Methode
        double b = punkt1.berechneAbstandVomNullpunkt(); // b sollte 5.0 sein
        System.out.println("Abstand zum Nullpunkt ist " + b);
        Punkt punkt2 = new Punkt(); // zweite Instanz erzeugen
        punkt2.leseWerteUeberTastatur(); // Eingabe von Werte ueber Tastatur
        punkt2.gibWerteAus();
        b = punkt2.berechneAbstandVomNullpunkt();
        System.out.println("Abstand zum Nullpunkt ist " + b);
        b = punkt1.berechneAbstandZuPunkt(punkt2); // Abstand der Punkte zueinander
        System.out.println("Der Abstand zwischen den Punkten beträgt: " + b);
        double strecke = 3.;
        double richtung = 60.; // Angabe in Grad:
        //  0 Grad entspricht Verschiebung in x-Richtung
        // 90 Grad entspricht Verschiebung in y-Richtung
        Punkt punkt3 = punkt1.verschiebeUm(strecke, richtung);
        // Ausgehend vom Punkt punkt1 wird ein neuer Punkt
        // erzeugt, der von punkt1 in Richtung richtung in
        // der Entfernung strecke liegt.
        // Die Koordinaten von punkt1 werden nicht verändert!
        System.out.println("Neuer Punkt:");
        punkt3.gibWerteAus();
        b = punkt1.berechneFlaeche(punkt2, punkt3);
        System.out.println("Fläche: " + b);
        System.out.println("-------------------");
        System.out.println("Bitte geben Sie drei Punkte ein:");
        Punkt ersterPunkt = new Punkt();
        ersterPunkt.leseWerteUeberTastatur();
        Punkt zweiterPunkt = new Punkt();
        zweiterPunkt.leseWerteUeberTastatur();
        Punkt dritterPunkt = new Punkt();
        dritterPunkt.leseWerteUeberTastatur();
        ersterPunkt.gibWerteAus();
        zweiterPunkt.gibWerteAus();
        dritterPunkt.gibWerteAus();
        double flaeche = ersterPunkt.berechneFlaeche(zweiterPunkt, dritterPunkt);
        System.out.println("Fläche: " + flaeche);
    }
}
