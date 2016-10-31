package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;
import tpe.oo.interfaces.api.DigitalController;

public class DualShock4 implements DigitalController, AnalogController {

    DigitalController dContr = new DigitalControllerImpl();
    AnalogController aContr = new AnalogControllerImpl();

    int x, y;

    @Override
    public void up() {
        dContr.up();
    }

    @Override
    public void down() {
        dContr.down();
    }

    @Override
    public void left() {
        dContr.left();
    }

    @Override
    public void right() {
        dContr.right();
    }

    @Override
    public Point getPosition() {
        Point pos1 = dContr.getPosition();
        Point pos2 = aContr.getPosition();

        int posX = (int) (pos1.getX() + pos2.getX());
        int posY = (int) (pos1.getY() + pos2.getY());
        return new Point(posX, posY);
    }

    @Override
    public void up(double percent) {
        aContr.up(percent);
    }

    @Override
    public void down(double percent) {
        aContr.down(percent);
    }

    @Override
    public void left(double percent) {
        aContr.left(percent);
    }

    @Override
    public void right(double percent) {
        aContr.right(percent);
    }

}
