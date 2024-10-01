package org.example;

import java.io.IOException;

import io.github.softv.shufflecad.Shufflecad;
import io.github.softv.studica.RobotVmxTitan;

public class RobotContainer {
    public static void init() throws IOException {
        GlobalHolder.robot = new RobotVmxTitan(Constants.IS_REAL_ROBOT);
        GlobalHolder.wrapper = new RobotWrapper();
        GlobalHolder.program = new Program();
        if (Constants.ENABLE_SHUFFLECAD)
            Shufflecad.start();
    }

    public static void stop() throws InterruptedException {
        if (GlobalHolder.program != null)
            GlobalHolder.program.end();
        if (GlobalHolder.robot != null)
            GlobalHolder.robot.stop();
        if (Constants.ENABLE_SHUFFLECAD)
            Shufflecad.stop();
    }
}
