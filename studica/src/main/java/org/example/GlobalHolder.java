package org.example;

import io.github.softv.shufflecad.CameraVariable;
import io.github.softv.shufflecad.ShuffleVariable;
import io.github.softv.shufflecad.Shufflecad;
import io.github.softv.RobotVmxTitan;

public class GlobalHolder {
    public static RobotVmxTitan robot;
    public static Shufflecad shufflecad;
    public static RobotWrapper wrapper;
    public static Program program;

    // Shufflecad variables init
    public static ShuffleVariable svIrSensor;
    public static ShuffleVariable svUsSensor;
    public static ShuffleVariable svServoMotor;
    public static CameraVariable cvDefaultCamera;

    public static void initVariables()
    {
        svIrSensor = (ShuffleVariable)shufflecad.addVar(new ShuffleVariable("ir sens", ShuffleVariable.FLOAT_TYPE, ShuffleVariable.OUT_VAR));
        svUsSensor = (ShuffleVariable)shufflecad.addVar(new ShuffleVariable("us sens", ShuffleVariable.FLOAT_TYPE, ShuffleVariable.OUT_VAR));
        svServoMotor = (ShuffleVariable)shufflecad.addVar(new ShuffleVariable("servo m", ShuffleVariable.SLIDER_TYPE, ShuffleVariable.IN_VAR));
        cvDefaultCamera = (CameraVariable)shufflecad.addVar(new CameraVariable("default"));
    }
}