package tpe.oo.vererbung;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.ImageBase;
import de.smits_net.games.framework.sprite.Direction;
import de.smits_net.games.framework.sprite.Sprite;
import de.smits_net.games.framework.sprite.Velocity;

/**
 * Spielfeld.
 */
public class GameBoard extends Board{

    /** Alien, das durch das Bild läuft. */
    private AlienSprite alien, alien2, alien3;

    /** Asteroid. */
    private Sprite asteroid, asteroid2;

    /** Hintergrundbild. */
    private Image background;

    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
        // neues Spielfeld anlegen
        super(10, new Dimension(800, 600), Color.BLACK);

        // Hintergrundbild laden
        background = ImageBase.loadImage("assets/background");


        // TODO: Alien und Asteroid anlegen und positionieren
        alien = new AlienSprite(this, new Point(400,300));
        alien2 = new AlienSprite(this, new Point (400,200));
        alien3 = new AlienSprite(this, new Point(640, 400));

        asteroid = new Asteroid(this, new Point(100, 300));
        asteroid2 = new Asteroid(this, new Point(10, 200));


    }

    /**
     * Hintergrund zeichnen.
     */
    protected void drawBackground(Graphics g) {
        g.drawImage(background, 0, 0, null);
    }

    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     *
     * @param g Der Grafik-Kontext
     */
    public void drawGame(Graphics g) {

        // Objekte zeichnen
        alien.draw(g);
        alien2.draw(g);
        alien3.draw(g);
        asteroid.draw(g);
        asteroid2.draw(g);


    }

    /**
     * Spielsituation updaten. Wird vom Framework aufgerufen.
     *
     * @return Spiel läuft weiter, solange diese methode <code>true</code>
     *      zurück gibt
     */
    public boolean updateGame() {

        // Objekte bewegen


        alien.move();
        alien2.move();
        asteroid.move();
        asteroid2.move();

        // Kollision erkennen

        if (alien.intersects(asteroid) && alien.isActive()) {
            alien.explode();
        }
        if ((alien2.intersects(asteroid)||alien2.intersects(asteroid2)) && alien2.isActive())
            alien2.explode();

        return true;
    }
}
