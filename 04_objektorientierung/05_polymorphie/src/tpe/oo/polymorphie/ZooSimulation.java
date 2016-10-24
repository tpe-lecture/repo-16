package tpe.oo.polymorphie;

import tpe.oo.polymorphie.tiere.Affe;
import tpe.oo.polymorphie.tiere.Giraffe;
import tpe.oo.polymorphie.tiere.Gorilla;
import tpe.oo.polymorphie.tiere.ZooTier;

/**
 * Simulationsklasse.
 */
public final class ZooSimulation {

    /**
     * Konstruktor.
     */
    private ZooSimulation() {
        // keine Objekte benötigt
    }

    /**
     * Main-Methode.
     *
     * @param args Kommandozeilen-Argumente.
     */
    public static void main(String[] args) {

        Futterstelle futterstelle = new Futterstelle();
        ZooTier[] tiere = new ZooTier[3];

        tiere[0] = new Affe("Charlie");
        tiere[1] = new Gorilla("Buck");
        tiere[2] = new Giraffe("Debbie");

        gibTiereAus(tiere);

        System.out.println("Fütterung...");

        for (int j = 0; j < tiere.length; j++) {
            futterstelle.gibFutter(tiere[j]);
        }

        gibTiereAus(tiere);


    }

    /**
     * Gib alle Tiere aus.
     * @param tiere als Array
     */
    public static void gibTiereAus(ZooTier[] tiere) {
        for (int i = 0; i < tiere.length; i++) {
            System.out.println(tiere[i]);
        }
    }
}
