package tpe.enumeration.own;

import java.util.Random;

/**
 * enum für Würfeltyp.
 *
 * @author Özkan
 *
 */
public enum WuerfelTyp {
    D4(4), D6(6), D8(8), D10(10), D12(12), D20(20);

    private final int seitenzahl;

    /**
     * Konstruktor.
     *
     * @param seitenzahl.
     */
    private WuerfelTyp(int seitenzahl) {
        this.seitenzahl = seitenzahl;
    }

    /** Zufallszahlengenerator. */
    private final Random rnd = new Random();

    /**
     * Gibt Seitenzahl zurück.
     *
     * @return seitenzahl.
     */
    public int getSeitenzahl() {
        return seitenzahl;
    }

    public double avarage(WuerfelTyp wt) {

        switch (wt) {
            case D4:
                return 2.5;
            case D6:
                return 3.5;
            case D8:
                return 4.5;
            case D10:
                return 5.5;
            case D12:
                return 6.5;
            case D20:
                return 10.5;
            default:
                return 0;
        }
    }

//    /**
//     * Den Würfel werfen.
//     *
//     * @return Ergebnis des Wurfes.
//     */
//    public int roll() {
//        return rnd.nextInt(this.getSeitenzahl()) + 1;
//    }
}
