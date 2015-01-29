
package us.oh.k12.wkw.cart.circuitPi;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import us.oh.k12.wkw.cart.circuitPi.commands.ArmDoNothing;
import us.oh.k12.wkw.cart.circuitPi.commands.ArmGoDown;
import us.oh.k12.wkw.cart.circuitPi.commands.ArmGoUp;
import us.oh.k12.wkw.cart.circuitPi.commands.CommandBase;
import us.oh.k12.wkw.cart.circuitPi.commands.DriveDoNothing;
import us.oh.k12.wkw.cart.circuitPi.commands.DriveWithJoysticks;
import us.oh.k12.wkw.cart.circuitPi.subsystems.DriveSystem;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
//OPERATOR INTERFACE
    
    //Declare every input to the device
    private Joystick joystick;
    

    //Joystick
    //Joystick Drive = new Joystick(13);
    //Button armUp = new JoystickButton(Drive, 3);
    //Button armDown = new JoystickButton(Drive, 4);

    
    public OI() {
        
        super();
        
        this.joystick = new Joystick(1);
        
        
        // logitech attack 3 joystick
        // buttons
        // 6        1       11
        // 7      4 3 5     10
        //          2
        //         8 9 
        //
        
        new JoystickButton(this.joystick, 6)
                .whileHeld(new ArmGoUp());
        
        new JoystickButton(this.joystick, 7)
                .whileHeld(new ArmGoDown());
        
        new JoystickButton(this.joystick, 11)
                .whenPressed(new ArmDoNothing());
        
        new JoystickButton(this.joystick,10)
                .whenPressed(new DriveDoNothing());
       
        
    }
    
    public Joystick getJoystick() {
        return this.joystick;
    }
    

   



    /*
   public double getSpeed() {
       double speed;
       speed = Drive.getY();
       return speed;
   }
   
   public double getTurn() {
       double turn;
       turn = Drive.getTwist();
       return turn;
   }*/
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

