package org.example;

import org.example.other.RobotExtensions;
import org.opencv.core.Mat;

public class RobotWrapper {
    public float getIr() {
        return RobotExtensions.getAnalog(GlobalHolder.robot, Constants.SHARP_PORT);
    }

    public float getUs() {
        return RobotExtensions.getUltrasound(GlobalHolder.robot, Constants.SONIC_PORT);
    }

    public void setLeftMotorSpeed(float speed) {
        RobotExtensions.setMotorSpeed(GlobalHolder.robot, Constants.LEFT_MOTOR_PORT, speed);
    }

    public void setRightMotorSpeed(float speed) {
        RobotExtensions.setMotorSpeed(GlobalHolder.robot, Constants.RIGHT_MOTOR_PORT, speed);
    }

    public float getLeftMotorEnc() {
        return RobotExtensions.getMotorEnc(GlobalHolder.robot, Constants.LEFT_MOTOR_PORT);
    }

    public float getRightMotorEnc() {
        return RobotExtensions.getMotorEnc(GlobalHolder.robot, Constants.LEFT_MOTOR_PORT);
    }

    public float getYaw() {
        return GlobalHolder.robot.getYaw();
    }

    public void setServoAngle(float angle) {
        GlobalHolder.robot.setAngleHCDIO(angle, Constants.SERVO_MOTOR_PORT);
    }

    public Mat getCameraImage() {
        return GlobalHolder.robot.getCameraImage();
    }

    /**
     * Code that runs once every robot loop
     */
    public void periodic() {
        // Updates for outputs to the shufflecad
        GlobalHolder.svIrSensor.setFloat(this.getIr());
        GlobalHolder.svUsSensor.setFloat(this.getUs());

        // Updates servo angle from shufflecad
        this.setServoAngle(GlobalHolder.svServoMotor.getFloat());

        // Updates camera image in shufflecad
        GlobalHolder.cvDefaultCamera.setMat(this.getCameraImage());
    }
}
