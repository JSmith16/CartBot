
package us.oh.k12.wkw.cart.circuitPi;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import us.oh.k12.wkw.cart.circuitPi.commands.ArmGoDown;
import us.oh.k12.wkw.cart.circuitPi.commands.ArmGoUp;
import us.oh.k12.wkw.cart.circuitPi.commands.DriveBackwards;
import us.oh.k12.wkw.cart.circuitPi.commands.DriveForward;
import us.oh.k12.wkw.cart.circuitPi.commands.DriveTurnLeft;
import us.oh.k12.wkw.cart.circuitPi.commands.DriveTurnRight;
import us.oh.k12.wkw.cart.circuitPi.commands.DriveWithJoysticks;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI { //OPERATOR INTERFACE
    
    //Declare every input to the device
    Button driveForward = new DigitalIOButton(7);
    Button driveBackward = new DigitalIOButton(8);

    Button leftTurn = new DigitalIOButton(9);
    Button rightTurn = new DigitalIOButton(10);
    
    Button armHigher = new DigitalIOButton(11);
    Button armLower = new DigitalIOButton(12);
    
    Joystick Drive = new Joystick(13);
    
    public OI() {

//Assign commands to the buttons
        driveForward.whileHeld(new DriveForward());  
        driveBackward.whileHeld (new DriveBackwards());
        leftTurn.whileHeld(new DriveTurnLeft());
        rightTurn.whileHeld(new DriveTurnRight());
        armHigher.whileHeld(new ArmGoUp());
        armLower.whileHeld(new ArmGoDown());
   
    }
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

