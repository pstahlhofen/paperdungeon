import sas.Circle;
import sas.View;
import view.Stickman;

import java.awt.*;

public class ExampleSAS {

    public static void main (String[] args) throws InterruptedException {
        View view = new View("TestView");
        view.setBackgroundColor(new Color((0<<16) + (100<<8) + 0));

        Stickman stickman = new Stickman(view.getWidth() / 2, 80);

        /*
        Circle circle = new Circle(view.getWidth() / 2, 40, 10);
        circle.setColor(new Color(255, 255, 255));
        int i = 0;
        while (true) {
            if (view.keyUpPressed()) {
                circle.setDirection(0.0);
                circle.move(1);
                Thread.sleep(5);
            }
            if (view.keyRightPressed()) {
                circle.setDirection(90.0);
                circle.move(1);
                Thread.sleep(5);
            }
            if (view.keyDownPressed()) {
                circle.setDirection(180.0);
                circle.move(1);
                Thread.sleep(5);
            }
            if (view.keyLeftPressed()) {
                circle.setDirection(270.0);
                circle.move(1);
                Thread.sleep(5);
            }
        }
    */
    }
}
