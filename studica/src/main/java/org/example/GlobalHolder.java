package org.example;

import io.github.softv.shufflecad.CameraVariable;
import io.github.softv.shufflecad.ShuffleVariable;
import io.github.softv.shufflecad.Shufflecad;
import io.github.softv.studica.RobotVmxTitan;

public class GlobalHolder {
    public static RobotVmxTitan robot;
    public static RobotWrapper wrapper;
    public static Program program;

    // Shufflecad variables init
    public static ShuffleVariable svIrSensor = (ShuffleVariable)Shufflecad.addVar(new ShuffleVariable("ir sens", ShuffleVariable.FLOAT_TYPE, ShuffleVariable.OUT_VAR));
    public static ShuffleVariable svUsSensor = (ShuffleVariable)Shufflecad.addVar(new ShuffleVariable("us sens", ShuffleVariable.FLOAT_TYPE, ShuffleVariable.OUT_VAR));
    
    public static ShuffleVariable svServoMotor = (ShuffleVariable)Shufflecad.addVar(new ShuffleVariable("servo m", ShuffleVariable.SLIDER_TYPE, ShuffleVariable.IN_VAR));
    
    public static CameraVariable cvDefaultCamera = (CameraVariable)Shufflecad.addVar(new CameraVariable("default"));
}