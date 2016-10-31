package tpe.oo.interfaces.api;

import java.awt.Point;

/**
 * Implementierung eines Analogen Joysticks.
 * @author Özkan
 *
 */
public interface AnalogController {

    /**
     * Nach oben bewegen.
     */
    void up(double percent);

    /**
     * Nach unten bewegen.
     */
    void down(double percent);

    /**
     * Nach links bewegen.
     */
    void left(double percent);

    /**
     * Nach rechts bewegen.
     */
    void right(double percent);

    /**
     * Liefert die aktuelle Position zurück.
     *
     * @return Die Position.
     */
    Point getPosition();
}
