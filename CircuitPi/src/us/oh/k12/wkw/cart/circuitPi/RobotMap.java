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

    //PWM output ports
    public static final int rightMotor = 1;
    public static final int leftMotor = 2;
    
    //Digital IO ports
    public static final int ARM_COMPRESSOR_PRESSURE_SWITCH_DIGITAL_INPUT_PORT = 1;
    public static final int ARM_TOP_DIGITAL_INPUT_PORT = 2;
    public static final int ARM_BOTTOM_DIGITAL_INPUT_PORT = 3;
    
    //relay output ports
    public static final int ARM_COMPRESSOR_SPIKE_RELAY_OUTPUT_PORT = 1;
    
    //Solenoid ports
    public static final int ARM_DOUBLESOLENOID_UP_OUTPUT_PORT = 1;
    public static final int ARM_DOUBLESOLENOID_DOWN_OUTPUT_PORT = 2;
    
    

    // If you are using multiple modules, make to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    protected RobotMap() {
        super();
    }
}
