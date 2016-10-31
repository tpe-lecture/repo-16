package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;

public class AnalogControllerImpl implements AnalogController {

    private Point position = new Point(0,0);

    private double posX = 0.0;
    private double posY = 0.0;

    @Override
    public void up(double percent) {
        this.posY = this.posY - percent;

    }

    @Override
    public void down(double percent) {
        this.posY = this.posY + percent;

    }

    @Override
    public void left(double percent) {
        this.posX = this.posX - percent;
    }

    @Override
    public void right(double percent) {
        this.posX = this.posX + percent;

    }

    @Override
    public Point getPosition() {
        this.position = new Point((int) posX, (int) posY);
        return (Point) this.position.clone();
    }

}
