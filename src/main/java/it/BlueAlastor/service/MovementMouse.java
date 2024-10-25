package it.BlueAlastor.service;

import java.awt.*;
import java.awt.event.InputEvent;

public class MovementMouse {

    public void robotTest() throws InterruptedException {
        int xCord = 200;
        int yCord = 200;
        while(true){
            try {
                Robot robot = new Robot();
                robot.mouseMove(xCord, yCord);
                xCord += 1;
                yCord += 1;
                robot.mouseMove(xCord, yCord);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(4000);
                xCord -= 1;
                yCord -= 1;
                robot.mouseMove(xCord, yCord);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(4000);
            }catch ( AWTException e){
                System.out.println(e);

            }
        }

    }

}
