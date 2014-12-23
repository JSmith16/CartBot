package us.oh.k12.wkw.cart.circuitPi;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.

    //Motors
    public static final int leftMotor = 1;
    public static final int rightMotor = 2;
    public static final int armHeightMotor = 3;
    
    //Sensors
    //public static final int heightFinder = 4;
    //public static final int weightSensor = 5;
    

    // If you are using multiple modules, make to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
}
