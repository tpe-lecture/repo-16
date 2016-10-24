package tpe.oo.polymorphie;

//import tpe.oo.polymorphie.tiere.Affe;
//import tpe.oo.polymorphie.tiere.Giraffe;
//import tpe.oo.polymorphie.tiere.Gorilla;
import tpe.oo.polymorphie.tiere.ZooTier;

/**
 * Fütterung der Tiere.
 */
public class Futterstelle {


    /**
     * Füttert alle Tiere mit einer Methode.
     * @param tier von ZooTier
     */
    public void gibFutter(ZooTier tier) {
        tier.fuettern();
    }
}
