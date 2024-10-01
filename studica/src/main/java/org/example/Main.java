package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        // handling signals of prog terminate
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                RobotContainer.stop();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }));

        RobotContainer.init();

        // wait a bit so robocad inites
        Thread.sleep(100);

        GlobalHolder.program.initialize();

        while (true) {
            try {
                GlobalHolder.program.execute();
                GlobalHolder.wrapper.periodic();

                Thread.sleep(Constants.MAIN_LOOP_DELAY);
            }
            catch (Exception e) {
                // handle errors if needed
            }
        }
    }
}