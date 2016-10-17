/**
 * Klasse zur Umrechnung von Währungen.
 * @author Özkan
 *
 */
public class Waehrung {

    /**
     * Wechselkurs zum Dollar.
     */
    private final int kurs;

    /**
     * name Name der Währung (z.B. EURO)
     */
    private final String name;

    /**
     * kuerzel Kürzel der Währung (z.B. €)
     */
    private final String kuerzel;

    /**
     * Konstante um das Komma zu verschieben um
     * Ganzzahlberechnungen durchführen zu können.
     */
    private static final long TEILER = 10000;

    /**
     * Erzeugt ein neues Objekt.
     *
     * @param name Name der Währung (z.B. EURO).
     * @param kuerzel Kürzel der Währung (z.B. €).
     * @param kurs Wechselkurs zum Dollar.
     */
    public Waehrung(String name, String kuerzel, double kurs) {
        this.kurs = (int) (kurs * TEILER);
        this.name = name;
        this.kuerzel = kuerzel;
    }

    /**
     *
     * @param betrag als ganze Zahl
     * @param toWaehrung Währungsname
     * @return gibt den umgerechneten Betrag als Zielwährung zurück
     */
    public long umrechnen(long betrag, Waehrung toWaehrung) {
        return betrag * kurs / toWaehrung.kurs;
    }

    /**
     * getKurs.
     * @return gibt den aktuellen Kurs zurück.
     */
    public int getKurs() {
        return kurs;
    }

    /**
     * getName.
     * @return gibt den namen der Währung zurück (z.B. EURO).
     */
    public String getName() {
        return name;
    }

    /**
     * @return gibt das Kürzel der Währung zurück (z.B. $)
     */
    public String getKuerzel() {
        return kuerzel;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [%s] 1 %s = %.4f %s",
                name, kuerzel, "$",
                kurs / (double) TEILER, kuerzel);
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((name == null) ? 0 : name.hashCode());
        result = prime * result + kurs;
        result = prime * result
                + ((kuerzel == null) ? 0 : kuerzel.hashCode());
        return result;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Waehrung other = (Waehrung) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        }
        else if (!name.equals(other.name)) {
            return false;
        }
        if (kurs != other.kurs) {
            return false;
        }
        if (kuerzel == null) {
            if (other.kuerzel != null) {
                return false;
            }
        }
        else if (!kuerzel.equals(other.kuerzel)) {
            return false;
        }
        return true;
    }
}
