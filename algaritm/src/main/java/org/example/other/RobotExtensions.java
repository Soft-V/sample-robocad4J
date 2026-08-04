package org.example.other;

import io.github.softv.RobotAlgaritm;

public class RobotExtensions {
    public final static float getAnalog(RobotAlgaritm robot, int port) {
        switch (port) {
            case 1: return robot.getAnalog1();
            case 2: return robot.getAnalog2();
            case 3: return robot.getAnalog3();
            case 4: return robot.getAnalog4();
            case 5: return robot.getAnalog5();
            case 6: return robot.getAnalog6();
            case 7: return robot.getAnalog7();
            case 8: return robot.getAnalog8();
            default: return 0;
        }
    }

    public final static float getUltrasound(RobotAlgaritm robot, int port) {
        switch (port) {
            case 1: return robot.getUltrasound1();
            case 2: return robot.getUltrasound2();
            case 3: return robot.getUltrasound3();
            case 4: return robot.getUltrasound4();
            default: return 0;
        }
    }

    public final static void setMotorSpeed(RobotAlgaritm robot, int port, float speed) {
        switch (port) {
            case 0: robot.setMotorSpeed0(speed);
            case 1: robot.setMotorSpeed1(speed);
            case 2: robot.setMotorSpeed2(speed);
            case 3: robot.setMotorSpeed3(speed);
            default:
        }
    }

    public final static float getMotorEnc(RobotAlgaritm robot, int port) {
        switch (port) {
            case 0: return robot.getMotorEnc0();
            case 1: return robot.getMotorEnc1();
            case 2: return robot.getMotorEnc2();
            case 3: return robot.getMotorEnc3();
            default: return 0;
        }
    }
}
