package tpe.nested.staticmember;

import java.awt.EventQueue;
import java.awt.Point;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.board.MainWindow;
import de.smits_net.games.framework.image.AnimatedImage;
import de.smits_net.games.framework.image.ImagePack;
import de.smits_net.games.framework.image.StripedImage;
import de.smits_net.games.framework.sprite.AnimatedSprite;
import de.smits_net.games.framework.sprite.Direction;
import de.smits_net.games.framework.sprite.Sprite.BoundaryPolicy;

/**
 * Hauptklasse des Spiels.
 */
public class GameMain extends MainWindow {



    /**
     * Neues Spiel anlegen.
     */
    public GameMain() {
        super("Click Alien", new GameBoard());
    }

    /**
     * Startpunkt.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(GameMain::new);
    }
}

