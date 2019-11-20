package view;

import sas.Circle;
import sas.Ellipse;
import sas.Polygon;

import java.awt.*;

public class Stickman {
    private Circle head;
    private Ellipse body;
    private Polygon neck, leftArm, rightArm, leftLeg, rightLeg;

    public Stickman (int xp, int yp) {
        Color white = new Color(255, 255, 255);
        this.head = new Circle(xp, yp, 10, white);
        this.neck = new Polygon(xp + 10, yp + 20);
        neck.add(0, 10);
        this.body = new Ellipse(xp, yp + 30, 20, 50, white);
    }

    public void move () {

    }

    public void jump () {

    }
}
