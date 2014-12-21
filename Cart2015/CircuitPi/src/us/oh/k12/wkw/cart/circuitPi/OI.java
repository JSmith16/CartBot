
package us.oh.k12.wkw.cart.circuitPi;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import us.oh.k12.wkw.cart.circuitPi.commands.ArmGoDown;
import us.oh.k12.wkw.cart.circuitPi.commands.ArmGoUp;
import us.oh.k12.wkw.cart.circuitPi.commands.DriveWithJoysticks;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI { //OPERATOR INTERFACE
    
    //Declare every input to the device
    
    
    Button armHigher = new DigitalIOButton(11);
    Button armLower = new DigitalIOButton(12);
    
    
    //Joystick version
    Joystick Drive = new Joystick(13);
    Button armUp = new JoystickButton(Drive, 3);
    Button armDown = new JoystickButton(Drive, 4);
    public double speed;
    double turn;
    
    public OI() {

        //Assign commands to the buttons
      
        armHigher.whileHeld(new ArmGoUp());
        armLower.whileHeld(new ArmGoDown());
        
        
        //Joystick version

        armUp.whileHeld(new ArmGoUp());
        armDown.whileHeld(new ArmGoDown());
        
        
        
    
   }
    //Joystick
    public double getSpeed() {
        return Drive.getY();
    }
    
    public double getTurn() {
        return Drive.getTwist();
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

